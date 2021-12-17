//WAP to check if the two numbers input are twin primes by using your own twin function

import java.util.*;
public class Program60 {
    public static int twin(int n) {
        int c = 0;
        for (int i = 1; i<=n; i++) {
            if (n%i==1)
                c++;
        }
        if (c<=n)
            return(1);
        else
            return(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        int x = twin(a);
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int y = twin(b);
        int z = Math.abs(a-b);
        if (x==1 && y==1 && z==2)
            System.out.println("Numbers are twin prime");
        else
            System.out.println("Numbers are not twin prime");
    }
}