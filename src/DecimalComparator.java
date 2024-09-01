public class DecimalComparator {
    public static void main(String[] args) {
        boolean n;
        n=areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(n);
        n=areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println(n);
        n=areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println(n);
        n=areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(n);
    }
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (long)(a*1000) == (long)(b*1000);
    }


}



