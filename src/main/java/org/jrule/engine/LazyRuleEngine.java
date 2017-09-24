package org.jrule.engine;

import org.jrule.action.Action;
import org.jrule.condition.Condition;
import org.jrule.rule.Rule;

import java.util.List;

import static org.jrule.action.Actions.noOp;
import static org.jrule.condition.Conditions.alwaysFalse;

class LazyRuleEngine implements RuleEngine {

    private static final Rule NO_OP = new Rule() {
        @Override
        public Condition condition() {
            return alwaysFalse();
        }
        @Override
        public Action action() {
            return noOp();
        }
    };

    private final List<Rule> rules;

    LazyRuleEngine(List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public void execute() {
        rules
                .stream()
                .filter(rule -> rule.condition().evaluate())
                .findFirst()
                .orElse(NO_OP)
                .action()
                .execute();
    }
}
