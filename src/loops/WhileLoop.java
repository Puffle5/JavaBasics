package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        System.out.println("This is a 'while' loop.");
        Integer number = 10;
        while (number<20) {
            System.out.println("number is still less than 20.");
            number++;
        }
        System.out.println("We're going to read strings until the user inputs 'stop'.");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();


        while (!word.equals("stop")) {
            System.out.println("We are in the 'while' loop now.");
            System.out.println("Please enter 'stop'.");
            word = input.nextLine();
        }
        System.out.println("Thank you.");
    }
}
