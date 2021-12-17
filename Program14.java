import java.util.*;
class Program14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students, girls and boys in your class");
        double students = sc.nextDouble();
        double girls = sc.nextDouble();
        double boys = sc.nextDouble();
        double gPer = (girls/students)*100;
        double bPer = (boys/students)*100;
        System.out.println("Percentage of girls = "+gPer+"%"+" and Percentage of boys = "+bPer+"%");
    }
}