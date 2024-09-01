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

        int max = summer ? 45 : 35;
        return temperature >= 25 && temperature <= max;

    }
}
