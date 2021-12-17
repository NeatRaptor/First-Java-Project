//WAP to calculate the hypntenuse of the triangle using the formula c^2 = a^2 + b^2

import java.util.*;
class hypotenuse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides adjacent to right angle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = (a*a)+(b*b);
        double hy = Math.sqrt(c);
        System.out.println("The hypotenuse is = "+hy);
    }
}