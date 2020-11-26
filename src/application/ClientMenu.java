package application;
import object.StoreGestion;
import java.util.Scanner;

public class ClientMenu {

    public ClientMenu() {

        boolean keepTrying = true;

        while (keepTrying) {

            //Welcome to the client menu panel where the customer can see the list of products, go shopping and logout if he wants
            System.out.println("*********");
            System.out.println("Welcome "+Login.clientRegister.getFirstName()+" !");
            System.out.println("*********");
            System.out.println(" ");
            System.out.println("What do you want to do ?");
            System.out.println(" ");
            System.out.println("1 - List of products");
            System.out.println("2 - My Cart");
            System.out.println("3 - Logout");

            //The choice of the customer
            int numMenuChoice = getUserInput();

            switch (numMenuChoice) {
                case 1:
                    //Go to the store where the customer can buy products
                    StoreGestion.buyElement();
                case 2:
                    //Go to the cart to check what you've bought, as a customer
                    StoreGestion.clientCart.printCartItems();
                case 3:
                    //Back to the main menu
                    new HomeMenu();

                    //if the input is wrong
                default:
                    System.out.println("Option not available, please try again");

            }
        }
    }
    public static int getUserInput () {
        Scanner sc = new Scanner(System.in);

        //Checking if the input is correct or not
        int userInput = 0;
        try {
            userInput = sc.nextInt();
        } catch (Exception e) {
        }
        sc.nextLine();
        return userInput;
    }
}
