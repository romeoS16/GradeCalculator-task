import de.ba.experiment.GradeCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    // In dieser Gruppe arbeiten Sie mit Test-Driven Development (TDD).
    // Schreiben Sie Tests zuerst, bevor Sie die Methode implementieren
    // oder ändern (Red – Green – Refactor).

    @Test
    public void ninetyFivePoints_isGradeOne() {
        String result = GradeCalculator.grade(95);
        assertEquals("1", result);
    }

    // TODO: weitere Tests ergänzen
}
