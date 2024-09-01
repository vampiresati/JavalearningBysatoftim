package Arrayfunctionality;
import java.util.Arrays;
public class BinarySearchMethod {
    public static void main(String[] args) {
        String []names={"satvir","tamanna","navneet","anil","krishana","satnam","gautam","zeus"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int found=Arrays.binarySearch(names,"zeus");
        if (found==-1){
            System.out.println("Name is not found");
        }
        else {
            System.out.println("Name is found: "+names[found]+"at index: "+found);
        }
        int []n1={1,2,3,4,5,6};
        int []n2={1,2,3,4,5};
        System.out.println(Arrays.equals(n1,n2));

    }

}
