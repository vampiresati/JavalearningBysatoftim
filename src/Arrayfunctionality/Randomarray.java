package Arrayfunctionality;
import java.util.Random;
import java.util.Arrays;
public class Randomarray {
    public static void main(String[] args) {
        int []a=Randomarray(10);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static int [] Randomarray(int n){
        Random rand = new Random();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = rand.nextInt(100);
        }
        return arr;
    }
}
