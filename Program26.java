import java.util.*;
class Program26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        String name = sc.nextLine();
        System.out.println("Enter your choice");
        int ch = sc.nextInt();
        int amt = 0;
        double d = 0, rp, np, tax;
        if (ch==1) {
            System.out.println("Enter the amount of purchase");
            amt = sc.nextInt();
            if (amt>0 && amt<=20000) {
                d = amt*0.05;
            } else if (amt>20000 && amt<=40000) {
                d = amt*0.075;
            } else if (amt>40000 && amt<=60000) {
                d = amt*0.1;
            } else if (amt>60000) {
                d = amt*0.12;
            }
        }
        if (ch==2) {
            System.out.println("Enter the amount of purchase");
            amt = sc.nextInt();
            if (amt>0 && amt<=20000) {
                d = amt*0.025;
            } else if (amt>20000 && amt<=40000) {
                d = amt*0.05;
            } else if (amt>40000 && amt<=60000) {
                d = amt*0.07;
            } else if (amt>60000) {
                d = amt*0.085;
            }
        }
        rp = amt-d;
        tax = rp*0.125;
        np = rp+tax;
        System.out.println("Customer's name: "+name);
        System.out.println("The price of the product: Rs. "+amt);
        System.out.println("The discount: Rs. "+d);
        System.out.println("The tax: Rs. "+tax);
        System.out.println("The amount to be paid: Rs. "+np);
    }
}