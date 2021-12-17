/*WAP to generate the given number pattern:

9
7 5
5 3 1

*/

public class Program53 {
    public static void main(String[] args) {
        int i,j,a,b = 9;
        for (i=1; i<=3; i++) {
            a = b;
            for (j=1; j<=i; j++) {
                System.out.print(a+" ");
                a-=2;
            }
            b-=2;
            System.out.println();
        }
    }
}