import java.util.*;
class ch2Q19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name, Class, Roll no, Subject and School");
        String n = sc.nextLine();
        int cl = sc.nextInt();
        int rn = sc.nextInt();
        sc.nextLine();
        String sub = sc.nextLine();
        String scl = sc.next();
        System.out.println("Name: "+n);
        System.out.println("Class: "+cl);
        System.out.println("Roll no: "+rn);
        System.out.println("Subject: "+sub);
        System.out.println("School: "+scl);
    }
}