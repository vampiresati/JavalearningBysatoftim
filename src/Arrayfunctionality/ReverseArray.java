package Arrayfunctionality;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] b= {6,2,3,4,5,6,7};
        reverse(b);
    }
    private static void reverse(int[] array) {

        System.out.println("Array = " + Arrays.toString(array));
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];                    // 1
            array[i] = array[maxIndex - i];         // 2
            array[maxIndex - i] = temp;             // 3
        }
        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}