import org.junit.Test;

import static org.junit.Assert.*;

public class FormulaThreeTest {


    public Calculator calculator = new Calculator();

    @Test
    public void calculateEquationThreeTestOne() {
        double expectedResult = 20815.8;
        double actualResult = calculator.calculateEquationThree(101.89);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);
    }

    @Test
    public void calculateEquationThreeTestTwo() {
        double expectedResult = 25.9;
        double actualResult = calculator.calculateEquationThree(2.934);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationThreeTestThree() {
        double expectedResult = 26.9;
        double actualResult = calculator.calculateEquationThree(3);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationThreeTestFour() {
        double expectedResult = 5090.75;
        double actualResult = calculator.calculateEquationThree(50);
        actualResult = Math.floor(actualResult * 100) / 100;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationThreeTestFive() {
        double expectedResult = 20056.5;
        double actualResult = calculator.calculateEquationThree(100);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationThreeTestSix() {
        double expectedResult = 20385.6;
        double actualResult = calculator.calculateEquationThree(100.8234);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationThreeTestSeven() {
        double expectedResult = 722.3;
        double actualResult = calculator.calculateEquationThree(18.3648);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }
}