import de.ba.experiment.GradeCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    // In dieser Gruppe arbeiten Sie mit TDD und dürfen zusätzlich KI nutzen.
    // Bevor Sie eine KI um Hilfe bitten (siehe README und ki-log.md).

    @Test
    public void ninetyFivePoints_isGradeOne() {
        String result = GradeCalculator.grade(95);
        assertEquals("1", result);
    }

    // TODO: weitere Tests ergänzen
}
