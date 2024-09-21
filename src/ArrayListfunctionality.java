import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListfunctionality {
    public static void main(String[] args) {
        ArrayList<String> name_array=new ArrayList<>();
        Boolean added_status=false;
        added_status=name_array.add("sati");
        System.out.println("added_status: "+added_status);

        added_status=name_array.add("rat");
        System.out.println("added_status: "+added_status);
        added_status=name_array.add("rat1");
        added_status=name_array.add("rat2");
        added_status=name_array.add("rat3");
        added_status=name_array.add("rat4");
        added_status=name_array.add("rat1");
        added_status=name_array.add("rat2");
        added_status=name_array.add("rat3");
        added_status=name_array.add("rat4");
        added_status=name_array.add("rat4");
        System.out.println(name_array);
        name_array.add(0,"firstsat");
        System.out.println(name_array.toArray());

        ArrayList<String> name_array2=new ArrayList<>();
        added_status=name_array2.addAll(name_array);
        System.out.println("added_status: "+added_status);
        System.out.println(name_array2);
        name_array2.clear();
        System.out.println(name_array2);
        ArrayList<String> name_array3=(ArrayList)name_array.clone();
        System.out.println(name_array3);

        System.out.println(name_array3.contains("firstsat1"));

        String e=name_array3.get(0);
        System.out.println(e);

        int a=name_array3.indexOf("rat3");
        System.out.println(a);

        Boolean b=name_array2.isEmpty();
        System.out.println(b);

        Iterator<String> iters=name_array3.iterator();
        System.out.println(iters);
        while (iters.hasNext()){
            String s=iters.next();
            System.out.println(s);
        }

        a=name_array3.lastIndexOf("rat3");
        System.out.println(a);

        ListIterator<String> lt=name_array3.listIterator();
        while (lt.hasNext()){
            String s1=lt.next();
            System.out.println(s1);
        }

    }
}
