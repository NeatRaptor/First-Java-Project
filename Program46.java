/*WAP to generate the given number pattern:

 1
 1 2
 1 2 3
 1 2 3 4

 */

public class Program46 {
    public static void main(String[] args){
        for (int i=1; i<5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}