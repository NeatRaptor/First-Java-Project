//WAP to find the sum of all digits of a number

import java.util.*;
public class Program42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n1 = n;
        int digit, sum = 0;
        while(n!=0) {
            digit = n%10;
            sum += digit;
            n = n/10;
        }

        System.out.println("The sum of all digits of "+n1+" is "+sum);
    }
}