//WAP to swap 2 numbers without using a third variable
import java.util.*;
class Program8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping a = "+a+" b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = "+a+" b = "+b);
    }
}