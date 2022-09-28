import java.util.*;
public class Program72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[6]; int count=0, k=0;
        System.out.println("Enter elements in ascending order");
        for(int i = 0; i<a.length; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the search element");
        int n = sc.nextInt();
        int lb = 0, ub = 5, mid;
        while(lb<=ub) {
            mid = (lb+ub)/2;
            if (a[mid]==n) {
                count++;
                k=mid;
                break;
            } else if (n>a[mid]) {
                lb = mid+1;
            } else {
                ub = mid-1;
            }
        }
        if(count==1)
            System.out.println("Element is found and the index(position) is "+k);
        else
            System.out.println("Element is not found");
    }
}
