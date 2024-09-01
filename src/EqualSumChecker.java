public class EqualSumChecker {
    public static void main(String[] args) {
        boolean status;
        status=hasEqualSum(1,1,1);
        System.out.println(status);
        status=hasEqualSum(1,1,2);
        System.out.println(status);
        status=hasEqualSum(1,-1,0);
        System.out.println(status);
    }
    public static boolean hasEqualSum(int a,int b,int c) {
        return (a+b)==c;
    }
}
