import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original: " + Arrays.toString(array));

        // ArrayReversal without decrement operation
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i]; //1
            array[i] = array[array.length - 1 - i]; //5-1-0 //4
            array[array.length - 1 - i] = temp; //4
        }

        System.out.println("Reversed: " + Arrays.toString(array));
    }
}
