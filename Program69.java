import java.util.*;
public class Program69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        int sum = 0, pro = 1;
        System.out.println("Choose any numbers");
        for (int i = 0; i<a.length; i++) {
            a[i] = sc.nextInt();
            sum+=a[i];
            pro*=a[i];
        }
        System.out.println("Sum of elements: "+sum);
        System.out.println("Product of elements: "+pro);
    }
}
