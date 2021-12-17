/* Write a menu driven program to
   1. Find the sum of the given series
      sum = x/1 + x/3 + x/5 + ...... up to n terms
   2. to generate a fibonacci series up to n terms
      0, 1, 1, 2, 3, 5, 8, 13 .........
 */
import java.util.*;
class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to find the sum of series, 2 to generate fibonacci series");
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
                System.out.println("Enter the number of terms");
                int n1 = sc.nextInt();
                System.out.println("Enter the value of x");
                double x = sc.nextDouble();
                double dr = 1.0d;
                double sum = 0.0d;
                for (int i=1; i<=n1; i++) {
                    sum += (x/dr);
                    dr += 2.0;
                }
                System.out.println("Sum of the terms is "+sum);
                break;
            case 2:
                System.out.println("Enter the number of terms");
                int n2 = sc.nextInt();
                int a = 0;
                int b = 1;
                int c = 0;
                System.out.println("The fibonacci series is ");
                System.out.println(a);
                System.out.println(b);
                for (int i=2; i<n2; i++) {
                    c = a+b;
                    System.out.println(c);
                    a = b;
                    b = c;
                }
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}