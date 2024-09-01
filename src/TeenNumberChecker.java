public class TeenNumberChecker {
    public static void main(String[] args) {
        boolean isTeenstatus;
        isTeenstatus = hasTeen(9, 99, 19);
        System.out.println(isTeenstatus);
        isTeenstatus = hasTeen(23, 15, 42);
        System.out.println(isTeenstatus);
        isTeenstatus = hasTeen(22, 23, 34);
        System.out.println(isTeenstatus);

    }

    public static boolean hasTeen(int a, int b, int c) {
       return isTeen(a)||isTeen(b)||isTeen(c);
    }

    public static boolean isTeen(int a) {
        if (a >= 13 && a <= 19)
            return true;
        return false;
    }



}
