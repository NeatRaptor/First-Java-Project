/*WAP to generate the given number pattern:

1
2 3
4 5 6
7 8 9 10

*/

public class Program51 {
    public static void main(String[] args) {
        int a = 0;
        for (int i = 1; i<5; i++) {
            for (int j = 1; j<=i; j++) {
                a++;
                System.out.print(a+" ");
            }
            System.out.println(" ");
        }
    }
}