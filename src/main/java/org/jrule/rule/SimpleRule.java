package org.jrule.rule;

import org.jrule.action.Action;
import org.jrule.condition.Condition;

class SimpleRule implements Rule {

    private final Condition condition;
    private final Action action;

    SimpleRule(Condition condition, Action action) {
        this.condition = condition;
        this.action = action;
    }

    @Override
    public Condition condition() {
        return condition;
    }

    @Override
    public Action action() {
        return action;
    }
}
