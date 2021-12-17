//WAP to input a number and reverse it

import java.util.*;
public class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n1 = n;
        int digit, rev = 0;
        while(n!=0) {
            digit = n%10;
            rev = (rev*10) + digit;
            n = n/10;
        }

        System.out.println("Original number is "+n1);
        System.out.println("Reversed number is "+rev);
    }
}