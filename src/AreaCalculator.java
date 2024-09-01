public class AreaCalculator {
    public static void main(String[] args) {
        double a;
        a=area(5.0);
        Printresult(a);
        a=area(-1);
        Printresult(a);
        a=area(5.0,4.0);
        Printresult(a);
        a=area(-1.0,4.0);
        Printresult(a);


    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1.0;
        }
        return Math.PI * radius * radius;
    }
    public static double area(double x, double y) {
        if(x < 0 || y < 0) {
            return -1.0;
        }
        return x * y;
    }
    public static void Printresult(double result) {
        if(result==-1.0){
            System.out.println("Area is not negative");
        }
        else{
            System.out.println("Area is "+result);
        }
    }

}
