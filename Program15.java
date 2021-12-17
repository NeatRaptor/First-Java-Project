import java.util.*;
class Program15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name, 3 subject marks, class and section");
        String name = sc.nextLine();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int cl = sc.nextInt();
        char sec = sc.next().charAt(0);
        double total = s1+s2+s3;
        double ave = total/3;
        System.out.println("Name: "+name+"\nClass: "+cl+"\nSection: "+sec);
        System.out.println("Subject 1\t Subject 2\t Subject 3");
        System.out.println("   " + s1 + "\t\t    " + s2 + "\t\t    " + s3);
        System.out.println("Total: "+total+"\nAverage: "+ave);
    }
}