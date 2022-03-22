import java.util.*;
public class Program62 {
    private int accNum;
    private String title;
    private String author;

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter book title: ");
        title = in.nextLine();
        System.out.print("Enter author: ");
        author = in.nextLine();
        System.out.print("Enter accession number: ");
        accNum = in.nextInt();
    }

    void compute() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of days late: ");
        int days = in.nextInt();
        int fine = 0;
        if (days == 7)
            fine = 10;
        else if (days > 7)
            fine = days*20;
        System.out.println("Fine = Rs." + fine);
    }

    void display() {
        System.out.println("Accession Number: "+accNum);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }

    public static void main(String[] args) {
        Program62 obj = new Program62();
        obj.input();
        obj.display();
        obj.compute();
    }
}
