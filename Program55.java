import java.util.*;
public class Program55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any number");
        int a = sc.nextInt();
        int b, sum = 0;
        int pro = 1;
        while(a!=0) {
            b = a%10;
            sum+=b;
            pro*=b;
            a/=10;
        }
        if (sum==pro) {
            System.out.println("This is a spy number");
        } else {
            System.out.println("Choose any again");
        }
    }
}