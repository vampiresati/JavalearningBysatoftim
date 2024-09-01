package ConversionCentimeter;

public class Conversioncentimeter {
    public static void main(String[] args) {
        System.out.println(centimeter(5,8)+"cm");
        System.out.println(centimeter(68)+"cm");

    }
    public static double centimeter(int inches){
        return inches * 2.54;
    }
    public static double centimeter(int feet, int inches){
        return centimeter(feet*12+inches);
    }
}
