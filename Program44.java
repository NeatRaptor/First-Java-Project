//WAP to check if the given number is a palindrome or not

import java.util.*;
public class Program44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n1 = n;
        int digit, rev = 0;
        do {
            digit = n%10;
            rev = (rev*10) + digit;
            n = n/10;
        } while(n!=0);

        if (n1==rev) {
            System.out.println("It is a palindrome number");
        } else {
            System.out.println("It is not a palindrome number");
        }
    }
}