/*Write a menu-driven program
1. to check if the given character is a vowel or a consonant
2. to generate the given series
   2, 5, 10, 17, ..... up to n terms
 */

import java.util.*;
class Program37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to check if the character is vowel or consonant, 2 to print series");
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
                System.out.println("Enter the character");
                char c = sc.next().charAt(0);
                if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
                    System.out.println(c+" is a vowel");
                } else {
                    System.out.println(c+" is a consonant");
                }
                break;
            case 2:
                System.out.println("Enter the number of terms");
                int n = sc.nextInt();
                for (int i=1; i<=n; i++) {
                    System.out.print(((i*i)+1)+" ");
                }
                break;
            default:
                System.out.println("Wrong input");
        }
    }
}