import org.junit.Test;

import static org.junit.Assert.*;

public class MessagesTest {

    public Messages messages = new Messages();

    @Test
    public void checkUserNumberOne() {
        boolean actualResult = messages.checkUserNumber(-234);
        assertFalse("Сheck for incorrectly entered data", actualResult);
    }

    @Test
    public void checkUserNumberTwo() {
        boolean actualResult = messages.checkUserNumber(1.2);
        assertFalse("Сheck for incorrectly entered data", actualResult);
    }

    @Test
    public void checkUserNumberThree() {
        boolean actualResult = messages.checkUserNumber(101.99);
        assertFalse("Сheck for incorrectly entered data", actualResult);
    }

    @Test
    public void checkUserNumberFour() {
        boolean actualResult = messages.checkUserNumber(101.9);
        assertFalse("Сheck for incorrectly entered data", actualResult);
    }


    @Test
    public void checkUserNumberFive() {
        boolean actualResult = messages.checkUserNumber(2.933);
        assertFalse("Сheck for incorrectly entered data", actualResult);
    }

}