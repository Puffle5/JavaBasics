package exceptions;
import java.util.Scanner;
public class Tester {
    public static void main(String[] args) throws DivideByZeroExceptions {
        Scanner scanner = new Scanner(System.in);
//        double a, b, result;
//        System.out.println("Enter first number: ");
//    a = scanner.nextDouble();
//    System.out.println("Enter second number: ");
//        b = scanner.nextDouble();
//        if (b == 0) {
//            try {throw new DivideByZeroExceptions("Cannot divide by zero!");}
//            catch (DivideByZeroExceptions e) {
//                System.out.println(e.getMessage());
//
//                return;
//            }
//        }
//        result = a/b;
//        System.out.println("The division of the two numbers is "+result);


        String password, confirmedPassword;
        System.out.println("Enter password: ");
        password = scanner.nextLine();
        System.out.println("Confirm password: ");
        confirmedPassword = scanner.nextLine();
        if (password.equals(confirmedPassword) == false) {
            throw new DivideByZeroExceptions("Passwords don't match!");

        }
        System.out.println("Passwords match!");
}}
