//WAP to find the sum of all the numbers entered by the user
import java.util.*;
class Program32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like to add?");
        int n = sc.nextInt();
        int sum = 0;
        int a;
        System.out.println("Enter the numbers");
        for (int i=1; i<=n; i++) {
            a = sc.nextInt();
            sum = sum+a;
        }
        System.out.println("Sum of all the numbers you entered is "+sum);
    }
}