import java.util.*;
public class Program79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name");
        String s = sc.nextLine();
        char ch = '\u0000';
        String s1 = "", s2 = "";
        int len = s.length();
        System.out.print("The short name is ");
        for (int i = 0; i < len; i++) {
            ch = s.charAt(i);
            if (ch != ' ') {
                s1+=ch;
            } else {
                System.out.print(Character.toUpperCase(s1.charAt(0)) + ". ");
                s1 = "";
            }
        }
        for (int j = 0; j < s1.length(); j++) {
            if (j == 0)
                s2 += Character.toUpperCase(s1.charAt(0));
            else
                s2 += Character.toLowerCase(s1.charAt(j));
        }
        System.out.println(s2);
    }
}
