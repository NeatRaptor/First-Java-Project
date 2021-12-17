//WAP to calculate the voltage using V=IR

import java.util.*;
class Program11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current and resistance");
        int i = sc.nextInt();
        int r = sc.nextInt();
        int v = i*r;
        System.out.println("The voltage is = "+v);
    }
}