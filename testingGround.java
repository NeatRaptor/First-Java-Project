import java.util.*;

public class testingGround {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first resistance");
        double r1 = sc.nextDouble();
        System.out.println("Enter the second resistance");
        double r2 = sc.nextDouble();
        System.out.println("Enter 1 to calculate series resistance, 2 to calculate parallel resistance");
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
                double sr = r1 + r2;
                System.out.println("The series resistance is "+sr);
                break;
            case 2:
                double pr = (r1*r2)/(r1+r2);
                System.out.println("The series resistance is "+pr);
                break;
            default:
                System.out.println("Wrong choice!");
        }
    }
}

/*
Variable Name         Data type                          Function
     r1                double           Stores the first resistance input from user
     r2                double           Stores the second resistance input from user
     sr                double           Stores and calculates the series resistance
     pr                double           Stores and calculates the parallel resistance
 */