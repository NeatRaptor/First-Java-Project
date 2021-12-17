import java.util.*;
class Program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, customer ID, and number of units consumed");
        String name = sc.nextLine();
        long id = sc.nextLong();
        int unit = sc.nextInt();
        double amt = 0.0d;
        if (unit>0 && unit<=100) {
            amt = unit*5.50;
        } else if (unit>100 && unit<=300) {
            amt = unit*6.50;
        } else if (unit>300 && unit<=600) {
            amt = unit*7.50;
        } else if (unit>600) {
            amt = unit*8.50;
        } else {
            System.out.println("Please enter a valid number");
        }
        System.out.println("Name: "+name);
        System.out.println("Customer ID: "+id);
        System.out.println("The bill to be paid is "+amt+" rupees");
    }
}