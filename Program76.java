import java.util.*;
public class Program76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        char ch = '\u0000';
        String s1 = "";
        int len = s.length();
        for(int i = 0; i<len; i++) {
            ch = s.charAt(i);
            if ('A'<=ch && ch<='Z') {
                ch = (char) (ch + 32);
                s1+=ch;
            } else if ('a'<=ch && ch<='z') {
                ch = (char) (ch - 32);
                s1+=ch;
            } else {
                s1+=ch;
            }
        }
        System.out.println("The changed string is "+s1);
    }
}
