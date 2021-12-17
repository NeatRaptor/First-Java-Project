import java.util.*;
public class Program57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any number");
        int num = sc.nextInt();
        int square = num * num;
        int count = 0;
        int temp = num;

        while(temp>0) {
            count++;
            temp/=10;
        }

        int lastDigit = (int) (square%(Math.pow(10, count)));

        if(num == lastDigit)
            System.out.println("This is an automorphic number");
        else
            System.out.println("Choose any again");
    }
}