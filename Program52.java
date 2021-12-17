/*WAP to generate the given number pattern:

1
1 0
1 0 1
1 0 1 0

*/

public class Program52 {
    public static void main(String[] args) {
        for (int i = 1; i<5; i++) {
            for (int j = 1; j<=i; j++) {
                if (j%2==0)
                    System.out.print("0 ");
                else
                    System.out.print("1 ");
            }
            System.out.println(" ");
        }
    }
}