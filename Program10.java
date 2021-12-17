//WAP to find the number of years, months and days, given the total number of days.
import java.util.*;
class Program10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int days = sc.nextInt();
        int d=0, rem=0, mon=0, year=0;
        year = days/365;
        rem = days%365;
        mon = rem/30;
        d = rem%30;
        System.out.println("Years = "+year+" Months = "+mon+" Days = "+d);
    }
}