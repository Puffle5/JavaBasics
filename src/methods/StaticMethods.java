package methods;

public class StaticMethods {
    public static void printArrayElements(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int[] array1 = {2, 0, 1, 8};
        int[] array2 = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        System.out.println("Call method for array1 four times.");
        printArrayElements(array1);
        printArrayElements(array1);
        printArrayElements(array1);
        printArrayElements(array1);
        System.out.println("Call method for array2 two times.");
        printArrayElements(array2);
        printArrayElements(array2);
        System.out.println("We're going to create a frog.");
        Frog sweetFrog = new Frog("JoJo");
        sweetFrog.jump("Elly");
        Frog.typeOfAnimal();
    }


}
