//Pig Latin
import java.util.*;
public class Program81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine();
        String s1 = "";
        char ch = '\u0000';
        int len = s.length(), i = 0;
        for (i=0; i<len; i++) {
            ch=s.charAt(i);
            ch=Character.toLowerCase(ch);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                s1=s.substring(i);
                break;
            }
        }
        s1 = s1+s.substring(0,i)+"ay";
        System.out.println("The word in Pig Latin is "+s1);
    }
}
