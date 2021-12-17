import java.util.*;
class ch2Q20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name, Father's Name, DOB, Blood Group, Aadhaar Card no and State");
        String n = sc.nextLine();
        String fn = sc.nextLine();
        String dob = sc.nextLine();
        String bg = sc.nextLine();
        int acn = sc.nextInt();
        sc.nextLine();
        String st = sc.next();
        System.out.println("Name: "+n);
        System.out.println("Father's Name: "+fn);
        System.out.println("Date of Birth: "+dob);
        System.out.println("Blood Group: "+bg);
        System.out.println("Aadhaar Card no: "+acn);
        System.out.println("State: "+st);
    }
}