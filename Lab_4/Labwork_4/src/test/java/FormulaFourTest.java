import org.junit.Test;

import static org.junit.Assert.*;

public class FormulaFourTest {

    public Calculator calculator = new Calculator();

    @Test
    public void calculateEquationFourTestOne() {
        double expectedResult = 422.8;
        double actualResult = calculator.calculateEquationFour(101.89);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);
    }

    @Test
    public void calculateEquationFourTestTwo() {
        double expectedResult = 12.1;
        double actualResult = calculator.calculateEquationFour(2.934);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationFourTestThree() {
        double expectedResult = 12.4;
        double actualResult = calculator.calculateEquationFour(3);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationFourTestFour() {
        double expectedResult = 207.5;
        double actualResult = calculator.calculateEquationFour(50);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationFourTestFive() {
        double expectedResult = 415;
        double actualResult = calculator.calculateEquationFour(100);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationFourTestSix() {
        double expectedResult = 418.4;
        double actualResult = calculator.calculateEquationFour(100.8234);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationFourTestSeven() {
        double expectedResult = 76.2;
        double actualResult = calculator.calculateEquationFour(18.3648);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }


}