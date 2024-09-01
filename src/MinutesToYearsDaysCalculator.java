public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes <0){
            System.out.println("Invalid Value");
        }
        int hours=(int)minutes/60;
        int day=hours/24;
        int year=day/365;

        System.out.println(year+"year "+day%365+"days "+hours%(24)+"hours ");



    }
}
