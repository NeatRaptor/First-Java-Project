/*WAP to find the simple interest and the amount
 given the principal, time and rate of interest*/
import java.util.*;
class Program9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal");
        int p = sc.nextInt();
        System.out.println("Enter the time");
        int t = sc.nextInt();
        System.out.println("Enter the rate of interest");
        int r = sc.nextInt();
        double si = 0.0d;
        si = p*t*r/100;
        double amt = 0.0d;
        amt = p+si;
        System.out.println("The simple interest is "+si+" and the amount is "+amt);
    }
}