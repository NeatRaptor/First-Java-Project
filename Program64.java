import java.util.*;
public class Program64 {
    int bno = 0;
    String name = " ";
    int call = 0;
    double amt = 0.0d;
    public static void main(String[] args) {
        Program64 caller = new Program64();
        caller.input();
        caller.compute();
        caller.display();
    }
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter bill number");
        bno = sc.nextInt();
        System.out.println("Enter total number of calls a month");
        call = sc.nextInt();
    }
    void compute() {
        if (call>0 && call<=100)
            amt = 125+(call*0.6);
        else if (call>100 && call<=200)
            amt = 125+(100*0.6)+(call-100)*0.8;
        else if (call>200 && call<=300)
            amt = 125+(100*0.6)+(100*0.8)+(call-200)*1.2;
        else if (call>300)
            amt = 125+(100*0.6)+(100*0.8)+(100*1.2)+(call-300)*1.5;
        else
            System.out.println("Choose proper number again");
    }
    void display() {
        System.out.println("Name: "+name);
        System.out.println("Bill number: "+bno);
        System.out.println("Total calls a month: "+call);
        System.out.println("Total amount: "+amt+" rupees");
    }
}
