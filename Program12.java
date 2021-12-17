import java.util.*;
class Program12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name and your salary");
        String name = sc.nextLine();
        double bSal = sc.nextDouble();
        double da = 0.0d;
        double hra = 0.0d;
        double pf = 0.0d;
        double gross = 0.0d;
        double net = 0.0d;
        da = (30.0/100.0)*bSal;
        hra = (12.5/100.0)*bSal;
        pf = (10.0/100.0)*bSal;
        gross = bSal+da+hra;
        net = gross-pf;
        System.out.print("Gross salary = $"+gross+" Net salary = $"+net);
    }
}