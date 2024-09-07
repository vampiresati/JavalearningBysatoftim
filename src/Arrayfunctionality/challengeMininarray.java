package Arrayfunctionality;
import java.util.Arrays;
import java.util.Scanner;

public class challengeMininarray {
    public static void main(String[] args) {
        int[] a={10,3,4,7,1,-1};
        int[] b=readIntergers();
        int min=findMin(b);
        System.out.println(min);
        min=findMinanotherlogic(b);
        System.out.println(min);
        b=sortIntegers(b);
        System.out.println(b[0]);
    }

    public static int[] readIntergers() {
        Scanner sc=new Scanner(System.in);
        System.out.println("seperated comma");
        String s=sc.nextLine();
        String[] a= s.split(",");
        System.out.println(Arrays.toString(a));

        int[] b=new int[a.length];
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            b[i]=Integer.parseInt(a[i].trim());
        }
        return b;
    }

    public static int findMinanotherlogic(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int findMin(int[] arr) {
        Arrays.sort(arr);
        return arr[0];
    }
    public static int[] sortIntegers(int []numbers){
        int nn1[]=new int[numbers.length];
        int temp;
        boolean flag=true;
        nn1=Arrays.copyOf(numbers,numbers.length);
        while(flag){
            flag=false;
            for(int i=0;i<nn1.length-1;i++){
                if(nn1[i]>nn1[i+1]){
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
