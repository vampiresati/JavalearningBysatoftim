public class LeapYear {
    public static void main(String[] args) {
        boolean leapYear;
        leapYear=isLeapYear(-1600);
        System.out.println(leapYear);
        leapYear=isLeapYear(1600);
        System.out.println(leapYear);
        leapYear=isLeapYear(2000);
        System.out.println(leapYear);
        leapYear=isLeapYear(2017);
        System.out.println(leapYear);

    }
    public static boolean isLeapYear(int year) {
        if(year<=1||year==9999) {
            return false;
        }
        if(year%4==0 && (year%100==0||year%400==0)){
             {
              return true;
            }
        }
        return false;
    }


}





