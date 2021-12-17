import java.util.*;
class Program24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("Square root of a negative number can't be determined");
        }
        else {
            double sqrtA = Math.sqrt(a);
            double sqrtB = Math.sqrt(b);
            double isAPerfectSq = sqrtA - Math.floor(sqrtA);
            double isBPerfectSq = sqrtB - Math.floor(sqrtB);

            if (isAPerfectSq == 0 && isBPerfectSq == 0) {
                System.out.println("They are perfect square numbers.");
            }
            else if (isAPerfectSq == 0) {
                System.out.println(a + " is a perfect square number.");
                System.out.println(b + " is not a perfect square number.");
            }
            else if (isBPerfectSq == 0) {
                System.out.println(a + " is not a perfect square number.");
                System.out.println(b + " is a perfect square number.");
            }
            else {
                System.out.println("Both are not perfect square numbers.");
            }
        }
    }
}
