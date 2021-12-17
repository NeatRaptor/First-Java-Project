/*WAP to generate the given pattern:

 4 4 4 4
 3 3 3
 2 2
 1

 */

public class Program48 {
    public static void main(String[] args){
        for (int i=4; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println(" ");
        }
    }
}