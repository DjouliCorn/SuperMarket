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

        System.out.print(" Enter a new user name or Quit (q) => ");
        String userName = sc.nextLine();
        System.out.print(" Enter a new password or Quit (q) => ");
        String password = sc.nextLine();

        clientRegister.setFirstName(userName);
        clientRegister.setPassword(password);

        new HomeMenu();
    }

    public static void loginClient() {

        System.out.print(" Enter your name or Quit (q) => ");
        String userName = sc.nextLine();
        System.out.print(" Enter your password or Quit (q) => ");
        String password = sc.nextLine();

        if (clientRegister.getFirstName().equals(userName) && clientRegister.getPassword().equals(password)) {
            System.out.println(" User successfully logged-in.. ");
            new ClientMenu();
        } else if ("q".equalsIgnoreCase(userName) && "q".equalsIgnoreCase(password)) {
            new HomeMenu();
        } else {
            System.out.println(" Invalid userName or password ");
            loginClient();
        }

    }
}
