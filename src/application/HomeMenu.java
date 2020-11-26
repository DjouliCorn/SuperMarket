package application;
import object.StoreGestion;

import java.util.Scanner;

public class HomeMenu {

    public HomeMenu() {

        //First menu to appear, we can choose if we use the app as a client or as an admin


        boolean keepTrying = true;


        while (keepTrying) {

            System.out.println("Welcome to the store !");
            System.out.println();
            System.out.println("What do you want to do ?");
            System.out.println("1 - Create a client account");
            System.out.println("2 - Log in as a client");
            System.out.println("3 - Log in as an administrator");
            System.out.println("4 - Exit");

            int numMenuChoice = getUserInput();


            switch (numMenuChoice) {
                case 1:
                    Login.createClientAccount();
                case 2:
                    Login.loginClient();
                case 3:
                    Login.loginAdmin();
                case 4:
                    keepTrying = false;
                    System.out.println("Bye !");
                    System.exit(0);

                default:
                    System.out.println("Option not available, please try again");

            }
        }

    }

    public static int getUserInput() {
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
