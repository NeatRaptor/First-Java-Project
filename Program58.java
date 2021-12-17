//WAP to input a number and reverse it uusing your own reverse function

import java.util.*;
public class Program58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any number");
        int num = sc.nextInt();
        System.out.println("Original Number: "+num);
        reverse(num);
    }
    public static void reverse(int a) {
        int digit, rev = 0;
        while(a!=0) {
            digit = a%10;
            rev = (rev*10) + digit;
            a/=10;
        }
        System.out.println("Reversed Number: "+rev);
    }
}