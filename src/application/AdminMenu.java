package application;
import object.StoreGestion;
import java.util.Scanner;

public class AdminMenu {

    public static void adminMenu(){

        boolean keepTrying = true;


        while (keepTrying) {

            System.out.println("Welcome Administrator !");
            System.out.println("What do you want to do ?");
            System.out.println("1 - List of products");
            System.out.println("2 - Add products");
            System.out.println("3 - Order list");
            System.out.println("4 - Return");

            int numMenuChoice = getUserInput();

            switch (numMenuChoice){
                case 1 :
                    StoreGestion.buyElement();
                case 2 :
                    StoreGestion.addElement();
                case 3 :
                    Cart.orderListAdmin();
                case 4 :
                    new HomeMenu();

                default:
                    System.out.println("Option not available, please try again");
            }
        }
    }
    public static int getUserInput () {
        Scanner sc = new Scanner(System.in);

        int userInput = 0;
        try {
            userInput = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Sorry wrong input");
        }
        sc.nextLine();
        return userInput;
    }
}

