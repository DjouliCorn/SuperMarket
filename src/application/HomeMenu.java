package application;

import java.util.Scanner;

public class HomeMenu {

    public HomeMenu() {

        //First menu to appear, we can choose if we use the app as a client or as an admin
        boolean keepTrying = true;

        //While keepTrying is true, the menu continues to run
        while (keepTrying) {

            System.out.println("**********************");
            System.out.println("Welcome to the store !");
            System.out.println("**********************");
            System.out.println();
            System.out.println("What do you want to do ?");
            System.out.println(" ");
            System.out.println("1 - Create a client account");
            System.out.println("2 - Log in as a client");
            System.out.println("3 - Log in as an administrator");
            System.out.println("4 - Exit");


            //The number that the user chooses
            int numMenuChoice = getUserInput();

            //Depending on the number entered, it allows the user to go in the different submenu
            switch (numMenuChoice) {
                case 1:
                    //The new client can create an account
                    Login.createClientAccount();
                case 2:
                    //Once the client has created an account, he can log in
                    Login.loginClient();
                case 3:
                    //The administrator can log in here
                    Login.loginAdmin();
                case 4:
                    //Exit the app
                    keepTrying = false;
                    System.out.println("Bye !");
                    System.exit(0);

                //If it's a wrong input, it sends this message error
                default:
                    System.out.println("Option not available, please try again");
                    System.out.println(" ");

            }
        }

    }

    /* This method contains the scanner that gets the value and
    analyses the scanner input to know if it's right or if an exception has to be executed.*/

    public static int getUserInput() {

        Scanner sc = new Scanner(System.in);

        int userInput = 0;
        try {
            userInput = sc.nextInt();
        } catch (Exception e) {
        }
        sc.nextLine();
        return userInput;
    }
}
