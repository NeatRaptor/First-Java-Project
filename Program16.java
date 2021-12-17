import java.util.*;
class Program16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character to get its ASCII value");
        String s = sc.next();
        char ch = s.charAt(0);
        int x = ch;
        System.out.println(x);
    }
}