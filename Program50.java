//WAP to find the sum of any two numbers for 10 iterations

import java.util.*;
public class Program50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a,b;
        for (int i=1; i<=10; i++) {
            System.out.println("Enter two numbers");
            a = sc.nextInt();
            b = sc.nextInt();
            if (a<0 || b<0)
                break;
            sum = a + b;
            System.out.println("Sum is "+sum);
        }
        System.out.println("Program terminated");
    }
}