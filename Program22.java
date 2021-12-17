import java.util.*;
class Program22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your total cost");
        double amt = sc.nextDouble();
        if (amt>0 && amt<=2000) {
            double amt1 = amt-amt*0.2;
            System.out.println("Pay "+amt1+" rupees and you will receive a free bag");
        } else if (amt>2000 && amt<=5000){
            double amt2 = amt-amt*0.3;
            System.out.println("Pay "+amt2+" rupees and you will receive a free wall clock.");
        } else if (amt>5000) {
            double amt3 = amt-amt*0.4;
            System.out.println("Pay "+amt3+" rupees and you will receive a free watch");
        } else {
            System.out.println("Please type a valid amount");
        }
    }
}