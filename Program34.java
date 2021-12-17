//WAP to check if a number is a prime number
import java.util.*;
class Program34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number check if it is a prime number");
        int n = sc.nextInt();
        int i, count = 0;
        for (i=1; i<=n; i++) {
            if (n%i == 0) {
                count++;
            }
        }
        
        if (count<=2) {
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is not prime");
        }
    }
}