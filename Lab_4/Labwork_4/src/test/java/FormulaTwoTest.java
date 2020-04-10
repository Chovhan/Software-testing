import org.junit.Test;

import static org.junit.Assert.*;

public class FormulaTwoTest {
    public Calculator calculator = new Calculator();

    @Test
    public void calculateEquationTwoTestOne() {
        double expectedResult = 2272238.3;
        double actualResult = calculator.calculateEquationTwo(101.89);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);
    }

    @Test
    public void calculateEquationTwoTestTwo() {
        double expectedResult = 53.2;
        double actualResult = calculator.calculateEquationTwo(2.934);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationTwoTestThree() {
        double expectedResult = 56.5;
        double actualResult = calculator.calculateEquationTwo(3);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationTwoTestFour() {
        double expectedResult = 265957.3;
        double actualResult = calculator.calculateEquationTwo(50);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationTwoTestFive() {
        double expectedResult = 2147739.6;
        double actualResult = calculator.calculateEquationTwo(100);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationTwoTestSix() {
        double expectedResult = 2201404.1;
        double actualResult = calculator.calculateEquationTwo(100.8234);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }

    @Test
    public void calculateEquationTwoTestSeven() {
        double expectedResult = 12805.7;
        double actualResult = calculator.calculateEquationTwo(18.3648);
        actualResult = Math.floor(actualResult * 10) / 10;;
        assertEquals("Test one", expectedResult, actualResult, 0);

    }


}