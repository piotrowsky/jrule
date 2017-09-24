package org.jrule.rule;

import org.jrule.action.Action;
import org.jrule.condition.Condition;

public interface Rule {

    Condition condition();

    Action action();
}
