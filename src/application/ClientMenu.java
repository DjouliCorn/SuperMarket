package application;
import object.StoreGestion;

import java.util.Scanner;

public class ClientMenu {

    public ClientMenu(){

        int numMenuChoice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome customer !");
        System.out.println("What do you want to do ?");
        System.out.println("1 - List of products");
        System.out.println("2 - My Cart");
        System.out.println("3 - Logout");

        numMenuChoice = sc.nextInt();

        switch (numMenuChoice){
            case 1 :
                new StoreGestion();
            case 2 :
                new Cart();
            case 3 :
                new HomeMenu();
        }
    }
}
