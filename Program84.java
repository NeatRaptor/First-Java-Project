//Frequency of input word in input sentence
import java.util.*;
public class Program84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        s+=" ";
        String s1 = "";
        System.out.println("Enter the search word");
        String word = sc.next();
        int i, count = 0;
        char ch = '\u0000';
        for (i = 0; i<s.length(); i++) {
            ch = s.charAt(i);
            if (ch!=32) {
                s1+=ch;
            } else {
                if(s1.equals(word))
                    count++;
                s1="";
            }
        }
        System.out.println("The frequency of the given word in sentence is "+count);
    }
}
