import java.util.Scanner;

public class Messages {

    public double inputNumber(){
        double userNumber;
        while (true){
            Scanner scanner = new Scanner(System.in);
            try {
                printInputText();
                userNumber = scanner.nextDouble();
                if (checkUserNumber(userNumber)){
                    return userNumber;
                }
            } catch (Exception e){
                printInvalidTypeExceptionText();
            }
        }
    }

    public boolean checkUserNumber(double userNumber) {
        boolean check = true;
        if (userNumber < 2.934 || userNumber > 101.89) {
            printInvalidRangeExceptionText();
            check = false;
        }
        return check;
    }

    public void printInvalidTypeExceptionText(){
        System.out.println("Invalid data");
    }

    public void printInputText(){
        System.out.println("Enter x between 2.934 and 101.89: ");
    }

    public void printInvalidRangeExceptionText(){
        System.out.println("You have some errors with typing your number, enter a number between 2.934 and 101.89!");
    }

    public void printResult(double userNumber, String formulaNumber){
        System.out.println("Answer with formula " + formulaNumber + " " + userNumber);
    }

}
