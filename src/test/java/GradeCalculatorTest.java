import de.ba.experiment.GradeCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    // In dieser Gruppe nutzen Sie das test-after-Prinzip:
    // 1. Implementieren Sie zuerst GradeCalculator.grade(int punkte).
    // 2. Schreiben Sie danach eigene Tests für typische und Randfälle.

    @Test
    public void ninetyFivePoints_isGradeOne() {
        String result = GradeCalculator.grade(95);
        assertEquals("1", result);
    }

    // TODO: weitere Tests ergänzen
}
