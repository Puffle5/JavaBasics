package exceptions;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.println("Enter first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        secondNumber = scanner.nextInt();
        int result;
        try {
            result = positiveNumbersAddition(firstNumber, secondNumber);
        } catch (DivideByZeroExceptions e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Result: "+result);
    }

    public static int positiveNumbersAddition (int firstNumber, int secondNumber) throws DivideByZeroExceptions
    {
        if (firstNumber < 0 || secondNumber < 0) {
            throw new DivideByZeroExceptions("We are only working with positive numbers!");
        }
        int sum = firstNumber + secondNumber;
        return sum;
    }
}
