package application;
import java.util.Scanner;

public class AdminMenu {

    public AdminMenu(){

        int numMenuChoice;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome Administrator !");
        System.out.println("What do you want to do ?");
        System.out.println("1 - List of products");
        System.out.println("2 - Add products");
        System.out.println("3 - Order list");
        System.out.println("4 - Return");

        numMenuChoice = sc.nextInt();

        switch (numMenuChoice){
            case 1 :
                ;
            case 2 :
                ;
            case 3 :
                ;
            case 4 :
                new HomeMenu();
        }
    }

}
