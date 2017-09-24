package org.jrule.rule;

public class Rules {

    private Rules() {
    }

    public static RuleBuilder simple() {
        return new SimpleRuleBuilder();
    }
}
