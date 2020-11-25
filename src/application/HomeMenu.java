package application;
import object.StoreGestion;

import java.util.Scanner;

public class HomeMenu {

    public HomeMenu(){

        //First menu to appear, we can choose if we use the app as a client or as an admin

        int numMenuChoice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the store !");
        System.out.println("What do you want to do ?");
        System.out.println("1 - Create a client account");
        System.out.println("2 - Log in as a client");
        System.out.println("3 - Log in as an administrator");
        System.out.println("4 - Exit");

        numMenuChoice = sc.nextInt();

        switch (numMenuChoice){
            case 1:
                StoreGestion.buyElement();
            case 2 :

            case 3 :
                Login.loginAdmin();
            case 4 :
                System.out.println("Bye !");
                System.exit(0);
        }
    }
}
