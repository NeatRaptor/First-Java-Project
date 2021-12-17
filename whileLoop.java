import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int x = 1; x<=5; x++) {
            System.out.println(x);
        }

        System.out.println(" ");

        int y = 1;
        while(y<=5) {
            System.out.println(y);
            y++;
        }

        System.out.println(" ");

        int z = 5;
        while(z>0) {
            System.out.println(z);
            --z;
        }

        System.out.println(" ");

        System.out.println("Enter the starting number");
        int s = sc.nextInt();
        System.out.println("Enter the ending number");
        int e = sc.nextInt();
        while(s<e){
            s++;
            if(s%2==0){
                System.out.println(s);
            }
        }
    }
}