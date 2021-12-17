//WAP to find the area and circumference of a circle
import java.util.*;
class Program6 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int r=sc.nextInt();
        double ac=0.0d;
        double cc=0.0d;
        ac=3.14*r*r;
        cc=2*3.14*r;
        System.out.println("The area of the circle is "+ac+" The circumference of the circle is "+cc);
    }
}