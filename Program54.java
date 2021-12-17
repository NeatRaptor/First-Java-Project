import java.util.*;
public class Program54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers for GCD");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        while(a%b!=0) {
            c = a % b;
            a = b;
            b = c;
        }
        System.out.println("GCD="+c);
    }
}