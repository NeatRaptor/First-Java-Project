//WAP to find the factorial of a number
import java.util.*;
class Program35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int factorialResult = 1;
        for (int i = 1; i<=num; i++) {
            factorialResult = factorialResult * i;
        }
        System.out.println("The factorial of " + num + " is " + factorialResult);
    }
}