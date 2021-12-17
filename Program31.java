// WAP to print the table of a given number
import java.util.*;
class Program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get the table");
        int n = sc.nextInt();
        for (int i=1; i<11; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}