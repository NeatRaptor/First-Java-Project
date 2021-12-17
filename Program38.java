/* WAP to find the sum of the given series
    sum = 1/x + 1/x^2 + 1/x^3 ..... up to n terms
 */

import java.util.*;
class Program38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the number of terms to add");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i<=n; i++) {
            sum += 1.0 / (Math.pow(x,i));
        }
        System.out.println("Sum: "+sum);
    }
}