import java.util.*;
public class Program77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a letter");
        char ch = sc.next().charAt(0);
        int a = 0;
        boolean x = Character.isUpperCase(ch);
        boolean y = Character.isLowerCase(ch);
        if (x==true)
            ch = Character.toLowerCase(ch);
        else if (y==true)
            ch = Character.toUpperCase(ch);

        a = ch;
        System.out.println("The new letter "+ch+" in ASCII code is "+a);
    }
}
