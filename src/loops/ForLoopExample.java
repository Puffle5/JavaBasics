package loops;


public class ForLoopExample {
    public static void main(String[] args) {
        System.out.println("We print 'Hello' ten times.");
        for (int i=0; i<10; i++) {
            System.out.println("Hello.");
        }

        System.out.println("We print the numbers from 20 to 10.");
        int counter = 20;
        for (int i=counter;i>=10; i--) {
            System.out.println(i);
        }
        System.out.println("****************");
        System.out.println("We fill the array with numbers 1-10.");
        int[] array = new int[10];
        for (int o=0; o<array.length; o++) {
            array[o] = o+1;
        }
        System.out.println("We print all of the array's elements.");
        for (int number:array) {
            System.out.println(number);
        }
    }
}
