package org.jrule.condition;

import java.util.function.BooleanSupplier;

public class Conditions {

    private Conditions() {
    }

    public static Condition from(BooleanSupplier supplier) {
        return supplier::getAsBoolean;
    }

    public static Condition alwaysTrue() {
        return () -> true;
    }

    public static Condition alwaysFalse() {
        return () -> false;
    }
}
