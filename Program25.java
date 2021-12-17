import java.util.*;
class Program25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter taxi number");
        String tNo = sc.nextLine();
        System.out.println("Enter distance covered");
        double d = sc.nextDouble();
        double amt = 0.0d;
        if (d>0 && d<=5) {
            amt = 100;
        } else if (d>5 && d<=15) {
            amt = 100+(d-5)*10;
        } else if (d>15 && d<=25) {
            amt = 200+(d-15)*8;
        } else if (d>25) {
            amt = 280+(d-25)*5;
        } else {
            System.out.println("Please enter the proper distance covered");
        }
        System.out.println("Taxi No: "+tNo);
        System.out.println("Distance covered: "+d+" kilometres");
        System.out.println("Amount: "+amt+" rupees");
    }
}