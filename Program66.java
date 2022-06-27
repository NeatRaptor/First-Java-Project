import java.util.*;
public class Program66 {
    String name;
    int age, m1, m2, m3;
    double maximum,average;
    public Program66(String n,int a,int mk1,int mk2,int mk3) {
        name = n;
        age = a;
        m1 = mk1;
        m2 = mk2;
        m3 = mk3;
    }
    public void compute() {
        maximum = Math.max(m3,Math.max(m1,m2));
        average = (m1+m2+m3)/3.0;
    }
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Subject marks: "+m1+", "+m2+", "+m3);
        System.out.println("Maximum marks: "+maximum);
        System.out.println("Average marks: "+average);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String n = sc.nextLine();
        System.out.println("Enter your age");
        int a = sc.nextInt();
        System.out.println("Enter your subject marks");
        int mk1 = sc.nextInt();
        int mk2 = sc.nextInt();
        int mk3 = sc.nextInt();
        Program66 student = new Program66(n,a,mk1,mk2,mk3);
        student.compute();
        student.display();
    }
}
