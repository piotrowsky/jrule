package org.jrule.condition;

import org.jrule.operator.Operator;

public interface Condition {

    boolean evaluate();

    default Condition not() {
        return () -> !evaluate();
    }

    default Condition and(Condition condition) {
        return () -> evaluate() && condition.evaluate();
    }

    default Condition or(Condition condition) {
        return () -> evaluate() || condition.evaluate();
    }

    default Condition xor(Condition condition) {
        return () -> evaluate() ^ condition.evaluate();
    }

    default Condition custom(Operator operator, Condition condition) {
        return () -> operator.apply(this, condition);
    }
}
