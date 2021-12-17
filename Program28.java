// Q16
import java.util.*;
class Program28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to find volume of cuboid, 2 for cylinder, and 3 for cone");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter the length, breadth and height");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double h1 = sc.nextDouble();
                double v1 = l * b * h1;
                System.out.println("Volume of cuboid = " + v1);
                break;

            case 2:
                System.out.println("Enter radius and height of cylinder");
                double r1 = sc.nextDouble();
                double h2 = sc.nextDouble();
                double v2 = (22.0 / 7.0) * r1 * r1 * h2;
                System.out.println("Volume of cylinder = " + v2);
                break;

            case 3:
                System.out.print("Enter radius and height of cone: ");
                double r2 = sc.nextDouble();
                double h3 = sc.nextDouble();
                double v3 = (1.0 / 3.0) * (22.0 / 7.0) * r2 * r2 * h3;
                System.out.println("Volume of cone = " + v3);
                break;

            default:
                System.out.println("Wrong choice! Please select from 1-3.");
        }
    }
}