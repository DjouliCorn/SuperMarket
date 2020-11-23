package application;

import object.Products;
import java.util.ArrayList;
import java.util.Scanner;


public class StoreManagement {

    /* Method which adds or deletes products available in the shopping list, */

    static Scanner sc = new Scanner(System.in);

    public StoreManagement(){

        Store myStore = new Store();

        System.out.println("This is a list of products available :");

        Products product1 = new Products(1, "Salad", 50, 2);
        Products product2 = new Products(2, "Pasta", 300, 0.5f);
        myStore.getListOfProducts().add(product1);
        myStore.getListOfProducts().add(product2);

        for (int i = 0; i < myStore.getListOfProducts().size(); i++) {
            System.out.println(myStore.getListOfProducts().get(i).getIndex()+" "+myStore.getListOfProducts().get(i).getName()+" "+myStore.getListOfProducts().get(i).getQuantity()+" "+myStore.getListOfProducts().get(i).getPrice());
        }
        chooseInTheListOfProducts();


    }

    public void chooseInTheListOfProducts(){
        int chooseItem;
        System.out.println("Choose an article or Quit (0) :");

        chooseItem = sc.nextInt();

    }

}
