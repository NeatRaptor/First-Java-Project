/*  WAP to find the sum of the given series 
    s= x/1! - x^2/2! + x^3/3! - x^4/4!......upto n terms
 */
import java.util.*;
class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextDouble();
        System.out.println("Enter the number of terms");
        int n = sc.nextInt();
        double s = 0.0d;
        int f = 1;
        for (int i = 1; i<=n; i++) {
            f *= i;
            if (i%2!=0) {
                s += ((Math.pow(x,i))/f);
            } else {
                s -= ((Math.pow(x,i))/f);
            }
        }
        System.out.println("Sum: "+s);
    }
}