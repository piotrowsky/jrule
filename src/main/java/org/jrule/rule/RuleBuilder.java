package org.jrule.rule;

import org.jrule.action.Action;
import org.jrule.condition.Condition;

public interface RuleBuilder {

    RuleBuilder when(Condition condition);

    Rule then(Action action);
}
