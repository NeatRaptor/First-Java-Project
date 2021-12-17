//WAP to find the number series
import java.util.*;
public class Program36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int terms = sc.nextInt();
        int addition = 1;
        int result = 1;
        for (int i = 1; i <= terms; i++) {
            result = result + addition;
            addition = addition + 2;
            System.out.println(result);
        }
    }
}