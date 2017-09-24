package org.jrule.rule;

import org.jrule.action.Action;
import org.jrule.condition.Condition;

class SimpleRuleBuilder implements RuleBuilder {

    private Condition condition;

    @Override
    public RuleBuilder when(Condition condition) {
        this.condition = condition;
        return this;
    }

    @Override
    public Rule then(Action action) {
        return new SimpleRule(condition, action);
    }
}
