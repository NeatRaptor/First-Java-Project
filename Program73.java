import java.util.*;
public class Program73 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int i, j, k, temp;
        System.out.println("Enter the elements of array");
        for(i = 0; i<a.length; i++)
            a[i] = sc.nextInt();
        for(i = 0; i<a.length; i++) {
            for(j = 0; j<a.length-i-1; j++) {
                if(a[j]>a[j+1]) {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.print("The sorted array is: ");
        for(k = 0; k<a.length; k++)
            System.out.print(a[k]+", ");
        System.out.println("\b\b");
    }
}
