//Arrays with names and arrays with numbers
import java.util.*;
public class Program82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names");
        int n = sc.nextInt();
        String s[] = new String[n];
        Long tel[] = new Long[n];
        int i, count = 0;
        String name;
        System.out.println("Enter the following:");
        for (i = 0; i<n; i++) {
            System.out.println("Person "+(i+1));
            System.out.print("Name: ");
            s[i] = sc.next();
            System.out.print("Telephone Number: ");
            tel[i] = sc.nextLong();
        }
        System.out.println("Enter the name to be searched");
        name = sc.next();
        for (i = 0; i<n; i++) {
            if (s[i].equals(name)) {
                count++;
                break;
            }
        }
        if (count==1)
            System.out.println("The name is "+s[i]+" and telephone number is "+tel[i]);
        else
            System.out.println(name+" is not found");
    }
}
