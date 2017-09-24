package org.jrule.action;

public class Actions {

    private Actions() {
    }

    public static final Action noOp() {
        return () -> {};
    }
}
