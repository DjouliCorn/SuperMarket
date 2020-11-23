package application;

import object.Products;
import java.util.ArrayList;
import java.util.Scanner;


public class StoreManagement {

    /* Method which adds or deletes products available in the shopping list, */

    static Scanner sc = new Scanner(System.in);

    Store myStore = new Store();

    public StoreManagement(){

        System.out.println("This is a list of products available :");

        Products product0 = new Products(0, "Case0", 50, 2);
        Products product1 = new Products(1, "Salad", 50, 2);
        Products product2 = new Products(2, "Pasta", 300, 0.5f);
        myStore.getListOfProducts().add(product0);
        myStore.getListOfProducts().add(product1);
        myStore.getListOfProducts().add(product2);

        for (int i = 1; i < myStore.getListOfProducts().size(); i++) {
            System.out.println(myStore.getListOfProducts().get(i).getIndex()+" "+myStore.getListOfProducts().get(i).getName()+" "+myStore.getListOfProducts().get(i).getQuantity()+" "+myStore.getListOfProducts().get(i).getPrice());
        }


        chooseInTheListOfProducts();


    }

    public void chooseInTheListOfProducts(){

        int chooseItem;
        System.out.println("Choose an article or Quit (0) :");

        chooseItem = sc.nextInt();

        for (int i = 1; i < myStore.getListOfProducts().size(); i++) {

            if(myStore.getListOfProducts().get(i).getIndex() == chooseItem){
                System.out.println(myStore.getListOfProducts().get(i).getIndex()+" "+myStore.getListOfProducts().get(i).getName());
                System.out.println("How much do you want ?");

            }else{
                System.out.println("Invalide choice");
                chooseInTheListOfProducts();
            }
        }
    }

}
