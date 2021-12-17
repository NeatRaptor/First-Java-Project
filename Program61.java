/*WAP to input a number and use a function int armstrong(int n) to accept the number. The functions returns 1 if the number is armstrong otherwise it returns 0.

Sample input:153
Sample output: 1^3 + 5^3 + 3^3 = 153
 */

import java.util.*;
public class Program61 {
    public static int armstrong(int n) {
        int c, b = n;
        int cubeSum = 0;
        while (n!=0) {
            c = n%10;
            cubeSum+=Math.pow(c,3);
            n/=10;
        }
        if (cubeSum==b)
            return(1);
        else
            return(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any number");
        int a = sc.nextInt();
        int test = armstrong(a);
        if (test == 1)
            System.out.println("It is an armstrong number");
        else
            System.out.println("It is not an armstrong number");
    }
}