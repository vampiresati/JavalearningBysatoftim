package Arrayfunctionality;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ArrayChallenge1 {
    public static void main(String[] args) {
        int length=getIntegers();
        int []n=new int[length];
        Random rand = new Random();
        for(int j=0;j<length;j++){
            n[j]=rand.nextInt(50);
        }

        System.out.println(Arrays.toString(n));
        int []s=sortIntegers(n,length);
        System.out.println(Arrays.toString(s));
        printArray(s);
    }
    public static int getIntegers(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        return n;
    }
    public static void printArray(int[] arr){
        for(int j=0;j<arr.length;j++){
            System.out.println("Element "+ j+" contents " +arr[j]);
        }
    }
    public static int[] sortIntegers(int []numbers,int length){
        int nn1[]=new int[length];
        int temp;
        boolean flag=true;
        nn1=Arrays.copyOf(numbers,numbers.length);
        while(flag){
            flag=false;
            for(int i=0;i<nn1.length-1;i++){
                if(nn1[i]<nn1[i+1]){
                    temp=nn1[i];
                    nn1[i]=nn1[i+1];
                    nn1[i+1]=temp;
                    flag=true;
                }
            }
        }
        return nn1;
    }

}
