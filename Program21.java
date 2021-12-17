import java.util.*;
class Program21 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("You are eligible to vote");
        } else if (age<18 && age>0){
            System.out.println("You are not eligible to vote");
        } else {
            System.out.println("Please enter a valid age");
        }
    }
}