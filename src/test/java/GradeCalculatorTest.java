import de.ba.experiment.GradeCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    @Test
    public void ninetyFivePoints_isGradeOne() {
        String result = GradeCalculator.grade(95);
        assertEquals("1", result);
    }

    // TODO: weitere Tests ergänzen
}
