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
    }

}
