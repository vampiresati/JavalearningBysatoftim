package Arrayfunctionality;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class ArrayChallenge1 {
    public static void main(String[] args) {
        int []n=new int[5];
        Random rand = new Random();
        for(int j=0;j<5;j++){
            n[j]=rand.nextInt(50);
        }

        System.out.println(Arrays.toString(n));

        int []s=sortIntegers(n);
        System.out.println(Arrays.toString(s));
    }
    public static int[] sortIntegers(int []numbers){
        int nn1[]=new int[5];
        int temp;
        boolean flag=true;
        nn1=Arrays.copyOf(numbers,numbers.length);
        System.out.println(Arrays.toString(nn1));
        while(flag){
            flag=false;
            for(int i=0;i<nn1.length-1;i++){
                if(nn1[i]<nn1[i+1]){
                    temp=nn1[i];
                    nn1[i]=nn1[i+1];
                    nn1[i+1]=temp;
                    flag=true;
//                    System.out.print("----->");
//                    System.out.println(Arrays.toString(nn1));
                }
//                System.out.print("---");
//                System.out.println(Arrays.toString(nn1));
            }
        }
//        System.out.println(Arrays.toString(nn1));
        return nn1;
    }

}
