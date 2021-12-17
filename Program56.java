import java.util.*;
public class Program56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any number");
        int a = sc.nextInt();
        int b, c = a, sum = 0;
        while(a!=0) {
            b = a%10;
            sum+=b;
            a/=10;
        }
        if (c%sum==0) {
            System.out.println("This is a niven number");
        } else {
            System.out.println("Choose any again");
        }
    }
}