// chapter 7 question 18
import java.util.*;
class ch7Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Series");
        System.out.println("2. Parallel");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        boolean isChoiceValid = true;

        System.out.print("Enter r1: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter r2: ");
        double r2 = sc.nextDouble();
        double eqr = 0.0;

        switch (choice) {
            case 1:
                eqr = r1 + r2;
                break;
            case 2:
                eqr = (r1 * r2) / (r1 + r2);
                break;
            default:
                isChoiceValid = false;
                System.out.println("Incorrect choice");
                break;
        }
        if (isChoiceValid)
            System.out.println("Equivalent resistance = " + eqr);
    }
}