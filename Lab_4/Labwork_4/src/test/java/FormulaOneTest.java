import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.*;

public class FormulaOneTest {
    public Calculator calculator = new Calculator();

    @Test
    public void calculateEquationOneTestOne() {
        double expectedResult = 2111616.9;
        double actualResult = calculator.calculateEquationOne(101.89);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);
    }

    @Test
    public void calculateEquationOneTestTwo() {
        double expectedResult = 29.9;
        double actualResult = calculator.calculateEquationOne(2.934);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationOneTestThree() {
        double expectedResult = 32.3;
        double actualResult = calculator.calculateEquationOne(3);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationOneTestFour() {
        double expectedResult = 245230.4;
        double actualResult = calculator.calculateEquationOne(50);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationOneTestFive() {
        double expectedResult = 1995637.337855101;
        double actualResult = calculator.calculateEquationOne(100);
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationOneTestSix() {
        double expectedResult = 2045628.4;
        double actualResult = calculator.calculateEquationOne(100.8234);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationOneTestSeven() {
        double expectedResult = 11471;
        double actualResult = calculator.calculateEquationOne(18.3648);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }
}