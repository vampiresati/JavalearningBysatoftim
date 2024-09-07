package Arrayfunctionality;

import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {
        int numbers=readInteger();
        int[] arr=readElements(numbers);
        int min=findMin(arr);
        System.out.println(min);
    }

    public static int readInteger() {
        System.out.println("Enter lenght of array to read: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    public static int[] readElements(int numbers) {
        int []array = new int[numbers];
        for(int i=0;i<numbers;i++) {
            Scanner scanner = new Scanner(System.in);
            array[i] = scanner.nextInt();
        }
      return  array;
    }
    public static int findMin(int[] arr) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }

}
