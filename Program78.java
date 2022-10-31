import java.util.*;
public class Program78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String s1 = "";
        int len = s.length();
        for(int i = len-1; i>=0; i--) {
            s1+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(s1)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }
}
