//Pattern with input string
import java.util.*;
public class Program85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        System.out.println("The pattern:");
        for (int i = 1; i<=s.length(); i++) {
            System.out.println(s.substring(0,i));
        }
    }
}
