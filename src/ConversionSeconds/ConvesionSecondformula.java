package ConversionSeconds;

public class ConvesionSecondformula {
    public static void main(String[] args) {
        System.out.println(convertToSeconds(3945));
        System.out.println(convertToSeconds(65,145));
    }
    public static String convertToSeconds(int seconds) {
        if (seconds < 0) {
            return "pass valid seconds";
        }
        String hours;
        int hours1=seconds / 3600;
        int minutes1 = (seconds % 3600)/60;
        int seconds1= seconds%60;
        hours=hours1+"Hours " +minutes1 +"minutes "+seconds1+"seconds ";
        return hours;
    }
    public static String convertToSeconds(int hours, int minutes, int seconds) {

        return convertToSeconds(hours * 3600 + minutes * 60 + seconds);
    }
    public static String convertToSeconds(int minutes, int seconds) {
        if (seconds < 0 || (!(seconds > 0 || seconds < 59))) {
            return "pass valid seconds";
        }
        if (minutes < 0) {
            return "pass valid mintues";
        }
        return convertToSeconds(minutes * 60 + seconds);
    }

}
