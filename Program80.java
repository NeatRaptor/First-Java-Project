//Sorting names with bubble sort
import java.util.*;
public class Program80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of names");
        int n = sc.nextInt();
        String s[] = new String[n];
        String temp;
        int i,j,k;
        System.out.println("Enter the names");
        for (i = 0; i<n; i++)
            s[i] = sc.next();
        for (i = 0; i<n-1; i++) {
            for (j = 0; j<n-i-1; j++) {
                if (s[j].compareTo(s[j+1])>0) {
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        System.out.println("Names in ascending order:");
        for (k = 0; k<n; k++)
            System.out.println(s[k]);
    }
}
