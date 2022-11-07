//Reversing each word in sentence
import java.util.*;
public class Program83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        s+=" ";
        String s1 = "", s2 = "";
        char ch = '\u0000', ch1 = '\u0000';
        for (int i = 0; i<s.length(); i++) {
            ch = s.charAt(i);
            if (ch!=32) {
                s1+=ch;
            } else {
                for (int j = s1.length()-1; j>=0; j--) {
                    ch1 = s1.charAt(j);
                    s2+=ch1;
                }
                s1="";
                s2+=" ";
            }
        }
        System.out.println("Reversed words in sentence is:");
        System.out.println(s2);
    }
}
