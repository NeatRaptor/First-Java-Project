import java.util.*;
public class Program67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Choose any numbers");
        int max = 0, min = 0;
        for(int i = 0; i<a.length; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i<a.length; i++) {
            if (i==0)
                min = a[i];
            if (a[i]>max)
                max = a[i];
            if (a[i]<min)
                min = a[i];
        }
        System.out.println("Maximum element: "+max);
        System.out.println("Minimum element: "+min);
    }
}
