import java.util.*;
public class Program65 {
    int year;
    float rating;
    String title;
    public Program65() {
        year = 0;
        title = "";
        rating = 0.0f;
    }
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose any movie");
        title = sc.nextLine();
        System.out.println("Enter year of release");
        year = sc.nextInt();
        System.out.println("Enter rating of movie");
        rating = sc.nextFloat();
    }
    public void display() {
        if (rating >=0.0 && rating <=2.0)
            System.out.println("The movie "+title+" is a flop");
        if (rating >=2.1 && rating <=3.4)
            System.out.println("The movie "+title+" is a semi-hit");
        if (rating >=3.5 && rating <=4.5)
            System.out.println("The movie "+title+" is a hit");
        if (rating >=4.6 && rating <=5.0)
            System.out.println("The movie "+title+" is a super-hit");
        else
            System.out.println("Choose proper rating again");
    }
    public static void main(String[] args) {
        Program65 film = new Program65();
        film.accept();
        film.display();
    }
}
