import java.util.*;
class Program19 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = (a>b)?a:b;
        System.out.println("The largest number is: "+x);
    }
}