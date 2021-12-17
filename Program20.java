import java.util.*;
class Program20 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("The number is positive");
        } else if (a<0){
            System.out.println("The number is negative");
        } else {
            System.out.println("The number entered is 0");   
        }
    }
}