package org.jrule.operator;

import org.jrule.condition.Condition;

public interface Operator {

    boolean apply(Condition left, Condition right);
}
