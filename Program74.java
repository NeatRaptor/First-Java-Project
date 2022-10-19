import java.util.*;
public class Program74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String S = sc.nextLine();
        int i, count = 0;
        char ch = '\u0000';
        S=S.toLowerCase();
        for(i = 0; i<S.length(); i++) {
            ch = S.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                count++;
        }
        System.out.println("Number of vowels is "+count);
    }
}
