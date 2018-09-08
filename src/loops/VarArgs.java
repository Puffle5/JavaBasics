package loops;
public class VarArgs {
    public static void main(String[] args) {
        int[] arr = {10, 3, 4, 7, 9, 16};
        int sum = calculateArraySum(arr);
        System.out.println(sum);


        int sum_2 = calculateArraySum2ndVersion(7, 0, 5, 3, 6);
        System.out.println(sum_2);


    }
        public static int calculateArraySum(int[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
          sum += args[i];
        }
        return sum;
        }
    public static int calculateArraySum2ndVersion(int... args) {

        if (args.length == 5) {
            System.out.println("The array is full.");
        }

        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}




