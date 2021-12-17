//WAP to print numbers 1, 2 and 4 using a for loop and continue statement

public class Program49 {
    public static void main(String[] args) {
        for (int i = 1; i<5; i++) {
            if (i==3)
                continue;
            System.out.println(i);
        }
    }
}