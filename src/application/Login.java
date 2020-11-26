package application;

import java.util.Scanner;

public class Login {

    static Register clientRegister = new Register();
    static Scanner sc = new Scanner(System.in);

    public static void loginAdmin() {

        //The information is already created. It's "admin" for username and password.
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name or Quit (q) => ");
            String userName = scanner.nextLine();

            System.out.print(" Enter password or Quit (q) => ");
            String password = scanner.nextLine();

            //If the user input is the same than admin and admin, the user can enter
            if ("admin".equals(userName) && "admin".equals(password)) {
                System.out.println(" ");
                System.out.println("User successfully logged-in.. ");
                System.out.println(" ");
                AdminMenu.adminMenu();
            }

            //If the user wants to quit the admin menu, he has to press the q key twice
            else if ("q".equalsIgnoreCase(userName) && "q".equalsIgnoreCase(password)) {
                //Back to the home menu
                new HomeMenu();
            } else {
                //If the user input doesn't match with the information,
                // an error message pops up and the user goes back to the login menu for admin
                System.out.println(" ");
                System.out.println(" Invalid userName or password ");
                loginAdmin();
            }
        }
    }

    public static void createClientAccount() {

        //Create a new account by choosing a username and a password
        System.out.print(" Enter a new user name or Quit (q) => ");
        String userName = sc.nextLine();
        System.out.print(" Enter a new password or Quit (q) => ");
        String password = sc.nextLine();
        System.out.println(" ");

        //Save the entries of the user in the register class
        clientRegister.setFirstName(userName);
        clientRegister.setPassword(password);

        //Then back to the main menu
        new HomeMenu();
    }

    public static void loginClient() {

        //The user connects to his session with the information he has given above
        System.out.print(" Enter your name or Quit (q) => ");
        String userName = sc.nextLine();
        System.out.print(" Enter your password or Quit (q) => ");
        String password = sc.nextLine();

        //Verify if the user has created an account first, and if the information is empty or wrong, the user goes to the home menu
        if (clientRegister.getFirstName() != null && !clientRegister.getFirstName().trim().isEmpty()
        && clientRegister.getPassword() != null && !clientRegister.getPassword().trim().isEmpty()) {

            //Comparing if the information entered by the user is the same with the login details
            if (clientRegister.getFirstName().equals(userName) && clientRegister.getPassword().equals(password)) {

                System.out.println(" User successfully logged-in.. ");
                System.out.println(" ");
                //If the information is correct, go to the client menu
                new ClientMenu();

                //If the user wants to quit the menu
            } else if ("q".equalsIgnoreCase(userName) && "q".equalsIgnoreCase(password)) {
                new HomeMenu();

            } else {
                //If the information is incorrect, it returns the user to the login menu
                System.out.println(" Invalid userName or password ");
                System.out.println(" ");
                loginClient();
            }

        } else {
            //If the customer doesn't already have an account, he has to create one.
            //So, after the message, he goes back to the home menu

            System.out.println(" ");
            System.out.println("Please, create a client account.");
            System.out.println(" ");
            new HomeMenu();
        }

    }
}
