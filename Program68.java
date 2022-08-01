import java.util.*;
public class Program68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, c1=0, c2=0;
        int phy[] = new int[40];
        int chem[] = new int[40];
        int maths[] = new int[40];

        for (i=0; i<40; i++) {
            System.out.println("Enter physics marks");
            phy[i] = sc.nextInt();
            System.out.println("Enter chemistry marks");
            chem[i] = sc.nextInt();
            System.out.println("Enter maths marks");
            maths[i] = sc.nextInt();
        }

        for (j=0; j<40; j++) {
            if ((phy[j]+chem[j]+maths[j])/3.0 >= 80)
                c1++;
            if ((phy[j]+chem[j]+maths[j])/3.0 <= 34)
                c2++;
        }
        System.out.println("Number of students with 80% and above: "+c1);
        System.out.println("Number of students with 34% and below: "+c2);

    }
}
