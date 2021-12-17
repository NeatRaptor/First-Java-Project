//WAP to find the area of a rectangle
import java.util.*;
class Program5 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");
        int b=sc.nextInt();
        int area=0;
        area=l*b;
        System.out.println("The area of the rectangle is "+area);
    }
}