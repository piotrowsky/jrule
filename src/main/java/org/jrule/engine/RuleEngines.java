package org.jrule.engine;

import com.google.common.collect.ImmutableList;
import org.jrule.rule.Rule;

public class RuleEngines {

    private RuleEngines() {
    }

    public static RuleEngine lazy(Rule... rules) {
        return new LazyRuleEngine(ImmutableList.copyOf(rules));
    }
}
