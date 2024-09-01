package Arrayfunctionality;
import java.util.Arrays;
public class ArrayFirstClass {
    public static void main(String[] args) {
    int []numberArray={5,4,3,2,1};

    for(int n:numberArray){
        System.out.println(n);
    }
    String s=Arrays.toString(numberArray);
    System.out.println(s);
    Object o=Arrays.toString(numberArray);
    System.out.println(o);
    }

}
