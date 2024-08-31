public class BarkingDog {
    public static void main(String[] args) {
        boolean barking;
        barking=shouldWakeUp (true, 1);
        System.out.println(barking);
        barking=shouldWakeUp (false, 2);
        System.out.println(barking);
        barking=shouldWakeUp (true, 8);
        System.out.println(barking);
        barking=shouldWakeUp (true, -1);
        System.out.println(barking);
    }
    public static boolean shouldWakeUp(boolean barking,int hourOfDay) {
        if(hourOfDay<0 || hourOfDay>23){
            return false;
        }
        if((barking && hourOfDay<8) || (barking && hourOfDay>22)){
            return true;
        }
        return false;
    }

}



