package Arrayfunctionality;
import java.util.Arrays;
public class ReverseArraychallege {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println(Arrays.toString(a));
        int[] b=reverseArray(a);
        System.out.println(Arrays.toString(b));
    }
    public static int[] reverseArray(int[] arr) {
        int[] arrCopy = new int[arr.length];
        //arrCopy=Arrays.copyOf(arrCopy, arr.length);
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            arrCopy[arr.length-i-1]=arr[i];
        }
        return arrCopy;
    }
}
