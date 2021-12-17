//WAP to find all the factors of a given number
import java.util.*;
class Program33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its factors");
        int n = sc.nextInt();
        System.out.println("The factors of "+n+" are: ");
        for (int i=1; i<=n; i++) {
            if (n%i == 0) {
                System.out.println(i);
            }
        }
    }
}