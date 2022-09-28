import java.util.*;
public class Program71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10]; int count=0, k=0;
        System.out.println("Enter the elements of array");
        for(int i = 0; i<10; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter the search element");
        int n = sc.nextInt();
        for(int i = 0; i<10; i++) {
            if (a[i]==n){
                count++;
                k = i;
                break;
            }
        }
        if(count==1)
            System.out.println("Element is found and the index(position) is: "+k);
        else
            System.out.println("Element is not found");
    }
}
