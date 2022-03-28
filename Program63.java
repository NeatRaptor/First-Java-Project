import java.util.*;
public class Program63 {
    public static double series(double n) {
        double sum = 0.0d;
        for (int i = 1; i<=n; i++)
            sum += 1.0/i;
        return(sum);
    }
    public static double series(double a, double n) {
        double sum = 0.0d;
        double numerator = 1.0d;
        double denominator = a*a;
        while (n!=0) {
            sum += numerator/denominator;
            numerator+=3;
            denominator*=a*a*a;
            n--;
        }
        return(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any numbers");
        double n = sc.nextDouble();
        double a = sc.nextDouble();
        double oneSeries = series(n);
        double twoSeries = series(a,n);
        System.out.println("Sum of first series is "+oneSeries);
        System.out.println("Sum of second series is "+twoSeries);
    }
}
