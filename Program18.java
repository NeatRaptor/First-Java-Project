import java.util.*;
class Program18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base and perpendicular of triangle");
        double base = sc.nextDouble();
        double per = sc.nextDouble();
        double temp = Math.pow(base,2)+Math.pow(per,2);
        double hypo = Math.sqrt(temp);
        System.out.println("The hypotenuse will be equal to: "+hypo);

        //hypo = Math.sqrt(Math.pow(base,2)+Math.pow(per,2));
    }
}