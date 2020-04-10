
public class Calculator {

    public static void main(String[] args) {
        Messages messages = new Messages();
        double userNumber = messages.inputNumber();
        messages.printResult(calculateEquationOne(userNumber), "one");
        messages.printResult(calculateEquationTwo(userNumber), "two");
        messages.printResult(calculateEquationThree(userNumber), "three");
        messages.printResult(calculateEquationFour(userNumber), "four");
    }

    public static double calculateEquationOne(double userNumber) {
        return pow(userNumber, 1.752) + pow(userNumber, 3) * 2.031 - pow(userNumber, 2) * 3.874 + userNumber * 1.858;
    }

    public static double calculateEquationTwo(double userNumber) {
        return pow(userNumber, 3) * 2.169 - pow(userNumber, 2) * 2.185 + userNumber * 5.896;
    }

    public static double calculateEquationThree(double userNumber) {
        return pow(userNumber, 2) * 1.975 + userNumber * 3.065;
    }

    public static double calculateEquationFour(double userNumber) {
        return userNumber * 4.15;
    }

    public static double pow(double firstNumber, double secondNumber){
        return Math.pow(firstNumber, secondNumber);
    }

}
