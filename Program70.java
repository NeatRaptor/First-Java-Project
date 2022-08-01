import java.util.*;
public class Program70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int i, e = 0, o = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        int even[] = new int[n];
        int odd[] = new int[n];
        System.out.println("Choose any numbers");
        for (i = 0; i<n; i++)
            a[i] = sc.nextInt();
        for (i = 0; i<a.length; i++)
            System.out.print(a[i]+", ");
        System.out.println("\b\b");
        for (i = 0; i<n; i++) {
            if (a[i]%2==0) {
                even[i] = a[i];
                e+=a[i];
            }
            else {
                odd[i] = a[i];
                o+=a[i];
            }
        }
        System.out.print("Even Numbers Array: ");
        for (i = 0; i<even.length; i++)
            System.out.print(even[i]+", ");
        System.out.println("\b\b");
        System.out.print("Odd Numbers Array: ");
        for (i = 0; i<odd.length; i++)
            System.out.print(odd[i]+", ");
        System.out.println("\b\b");
        System.out.println("Sum of even numbers in array: "+e);
        System.out.println("Sum of odd numbers in array: "+o);
    }
}
