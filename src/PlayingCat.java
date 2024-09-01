public class PlayingCat {
    public static void main(String[] args) {
        boolean s;
        s=isCatPlaying(true,10);
        System.out.println(s);
        s=isCatPlaying(false,36);
        System.out.println(s);
        s=isCatPlaying(false,35);
        System.out.println(s);
    }
    public static boolean isCatPlaying(Boolean summer,int temperature) {

        if (summer == true) {
            if (temperature >=25 && temperature <=45) {
                return true;
            }
            else {
                return false;
            }
        }
        else{
            if (temperature >=25 && temperature <=35) {
                return true;
            }
            else {
                return false;
            }
        }

    }
}
