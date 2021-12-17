import java.util.*;
class Program17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        int lar = 0, sml = 0;
        lar = Math.max(Math.max(num1,num2),num3);
        sml = Math.min(Math.min(num1,num2),num3);
        
        System.out.println("Greatest number "+lar);
        System.out.println("Smallest number "+sml);
    }
}
