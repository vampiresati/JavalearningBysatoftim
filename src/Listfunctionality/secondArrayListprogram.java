package Listfunctionality;


import java.util.ArrayList;
import java.util.List;
public class secondArrayListprogram {
    public static void main(String[] args) {
        String[] array={"apples","banana","orange"};
        List<String> list=List.of(array);
        System.out.println(list);
        ArrayList<String> list1=new ArrayList<>(list);
        list1.add("cherry");
        System.out.println(list1);
    }
}
