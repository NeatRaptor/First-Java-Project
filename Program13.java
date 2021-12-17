import java.util.*;
class Program13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of miles");
        int mile = sc.nextInt();
        double km = 0.0d;
        km = mile*1.6;
        System.out.println(km+" kilometres");
    }
}
