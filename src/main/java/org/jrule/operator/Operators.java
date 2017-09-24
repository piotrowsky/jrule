package org.jrule.operator;

public class Operators {

    private Operators() {
    }

    public static Operator longCircuitOr() {
        return (left, right) -> left.evaluate() | right.evaluate();
    }

    public static Operator longCircuitAnd() {
        return (left, right) -> left.evaluate() & right.evaluate();
    }
}
