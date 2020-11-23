package application;

import java.util.Scanner;

public class HomeMenu {

    public HomeMenu(){

        //First menu to appear, we can choose if we use the app as a client or as an admin

        int numMenuChoice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the store !");
        System.out.println("What do you want to do ?");
        System.out.println("1 - Log in as a client");
        System.out.println("2 - Log in as an administrator");
        System.out.println("3 - Exit");

        numMenuChoice = sc.nextInt();

        switch (numMenuChoice){
            case 1 :
                new ClientMenu();
            case 2 :
                new AdminMenu();
            case 3 :
                System.out.println("Bye !");
                System.exit(0);
        }
    }
}
