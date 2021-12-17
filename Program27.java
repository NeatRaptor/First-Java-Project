import java.util.*;
class Program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 1 to add, 2 to subtract, 3 to multiply, 4 to divide, and 5 to find remainder");
        int ch = sc.nextInt();
        switch(ch) {
            case 1:
                int add = a+b;
                System.out.println("Sum = "+add);
                break;
            case 2:
                int sub = a-b;
                System.out.println("Difference = "+sub);
                break;
            case 3:
                int pro = a*b;
                System.out.println("Product = "+pro);
                break;
            case 4:
                int quo = a/b;
                System.out.println("Quotient = "+quo);
                break;
            case 5:
                int rem = a%b;
                System.out.println("Remainder = "+rem);
                break;
            default:
                System.out.println("Please enter a number from 1-5");
        }
    }
}