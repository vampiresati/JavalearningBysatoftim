public class Section4Challenge {
    public static void main(String[] args) {
        double d1=20.00d;
        double d2=80.00d;
        double d3=((d1+d2)*100.00d)%40.00d;
        System.out.println(d3);
        boolean isresult=(d3==0)?true:false;
        System.out.println(isresult);
        if (!isresult) {
            System.out.println("Yes");
        }

    }
}
