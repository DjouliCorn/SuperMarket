package application;

import java.util.Scanner;

public class Login {

    static Register clientRegister = new Register();
    static Scanner sc = new Scanner(System.in);

    public static void loginAdmin() {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name or Quit (q) => ");
            String userName = scanner.nextLine();

            System.out.print(" Enter password or Quit (q) => ");
            String password = scanner.nextLine();

            if ("admin".equals(userName) && "admin".equals(password)) {
                System.out.println(" User successfully logged-in.. ");
                AdminMenu.adminMenu();
            } else if ("q".equalsIgnoreCase(userName) && "q".equalsIgnoreCase(password)) {
                new HomeMenu();
            } else {
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

        //Comparing if the information entered by the user are the same with the login details
        if (clientRegister.getFirstName().equals(userName) && clientRegister.getPassword().equals(password)) {

            System.out.println(" User successfully logged-in.. ");
            System.out.println(" ");
            //If the information is correct, go to the client menu
            new ClientMenu();

        } else if ("q".equalsIgnoreCase(userName) && "q".equalsIgnoreCase(password)) {

            //If the user wants to quit the menu
            new HomeMenu();

        } else {

            //If the information is incorrect
            System.out.println(" Invalid userName or password ");
            System.out.println(" ");
            loginClient();
        }

    }
}
