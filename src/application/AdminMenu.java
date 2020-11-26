package application;
import object.StoreGestion;
import java.util.Scanner;

public class AdminMenu {

    public static void adminMenu(){

        boolean keepTrying = true;


        while (keepTrying) {

            //Welcome to the admin menu panel where the administrator can see the list of products,
            //add products to the inventory, see the order list of customers and go back to the home menu
            System.out.println("***********************");
            System.out.println("Welcome Administrator !");
            System.out.println("***********************");
            System.out.println(" ");
            System.out.println("What do you want to do ?");
            System.out.println(" ");
            System.out.println("1 - List of products");
            System.out.println("2 - Add products");
            System.out.println("3 - Order list");
            System.out.println("4 - Return");

            //The choice of the administrator
            int numMenuChoice = getUserInput();

            switch (numMenuChoice){
                case 1 :
                    //Go to the store to see the list of products which are available
                    StoreGestion.listOfProductAdmin();
                case 2 :
                    //The administrator can add items to the list of products
                    StoreGestion.addElement();
                case 3 :
                    //See the cart of customers
                    Cart.orderListAdmin();
                case 4 :
                    //Go back to the main menu
                    new HomeMenu();

                default:
                    //If input is wrong
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

