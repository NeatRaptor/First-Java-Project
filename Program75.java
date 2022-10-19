import java.util.*;
public class Program75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String S = sc.nextLine();
        int i, spaces = 0, words = 0, letters = 0;
        char ch = '\u0000';
        for(i = 0; i<S.length(); i++) {
            ch = S.charAt(i);
            if(ch==32)
                spaces++;
        }
        words = spaces+1;
        letters = S.length();
        letters-=spaces;
        System.out.println("Number of words is "+words);
        System.out.println("Number of letters is "+letters);
        System.out.println("Number of spaces is "+spaces);
    }
}
