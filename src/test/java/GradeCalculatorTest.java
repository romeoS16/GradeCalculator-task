import de.ba.experiment.GradeCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    @Test
    public void ninetyFivePoints_isGradeOne() {
        String result = GradeCalculator.grade(95);
        assertEquals("1", result);
    }
    @Test
    public void eightyFivePoints_isGradeTwo() {
        String result = GradeCalculator.grade(85);
        assertEquals("2", result);
    }
    @Test
    public void seventyFivePoints_isGradeThree() {
        String result = GradeCalculator.grade(75);
        assertEquals("3", result);
    }
    @Test
    public void fiftyFivePoints_isGradeFour() {
        String result = GradeCalculator.grade(55);
        assertEquals("4", result);
    }
    @Test
    public void fortyFivePoints_isGradeNichtBestanden() {
        String result = GradeCalculator.grade(45);
        assertEquals("nicht bestanden", result);
    }
    @Test(expected = IllegalArgumentException.class)
    public void negativePoints_throwException() {
        GradeCalculator.grade(-45);
    }

    @Test(expected = IllegalArgumentException.class)
    public void tooManyPoints_throwException() {
        GradeCalculator.grade(2000);
    }

//    Ohne Exception
//    @Test
//    public void invalidPoints_returnUngueltig() {
//        assertEquals("ungültig", GradeCalculator.grade(-10));
//    }


}
