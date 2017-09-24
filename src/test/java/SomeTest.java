import org.junit.jupiter.api.Test;

import static org.jrule.action.Actions.noOp;
import static org.jrule.condition.Conditions.alwaysFalse;
import static org.jrule.condition.Conditions.alwaysTrue;
import static org.jrule.engine.RuleEngines.lazy;
import static org.jrule.rule.Rules.simple;

public class SomeTest {

    @Test
    void someTest() {
        lazy(simple()
                .when(
                        alwaysTrue().not().and(alwaysTrue().or(alwaysFalse()))
                )
                .then(noOp()))
        .execute();
    }

}
