// Q17
import java.util.*;
class Program29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ground floor");
        System.out.println("First floor");
        System.out.println("Second floor");
        System.out.println("Third floor");
        System.out.print("Select a floor: ");
        String floorVar = sc.nextLine();
        String floor = "";
        boolean isFloorValid = true;

        switch (floorVar) {
            case "G":
            case "g":
                floor = "Kids Wear";
                break;
            case "F":
            case "f":
                floor = "Ladies Wear";
                break;
            case "S":
            case "s":
                floor = "Designer Sarees";
                break;
            case "T":
            case "t":
                floor = "Men's Wear";
                break;
            default:
                isFloorValid = false;
                System.out.println("Incorrect Floor, type the first letter of floor name");
        }

        if (isFloorValid) {
            System.out.println("Name of the Shop: City Mart");
            System.out.println("Floor: "+floor);
        }
    }
}