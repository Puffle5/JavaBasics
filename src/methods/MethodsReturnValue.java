package methods;

public class MethodsReturnValue {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        calculateSum(array1);

        int arraySum = getArraySum(array1);
        System.out.println("The sum is "+arraySum+" this is the return value of the getArraySum method.");



    }
    public static void calculateSum(int[] array) {
        int number = 0;
        for (int i=0; i<array.length; i++) {
            number = number+array[i];
        }
        System.out.println("The sum is: "+number);
    }
    public static int getArraySum(int[] array) {
        int number = 0;
        for (int i=0; i<array.length; i++) {
            number = number+array[i];
        }
        return number;
    }
}
