package application;

import object.Products;

import java.util.Scanner;


public class StoreManagement {

    /* Method which adds or deletes products available in the shopping list, */

    static Scanner sc = new Scanner(System.in);

    Store myStore = new Store();

    public StoreManagement() {

        System.out.println("This is a list of products available :");

        Products product0 = new Products(0, "Case0", 50, 2);
        Products product1 = new Products(1, "Salad", 50, 2);
        Products product2 = new Products(2, "Pasta", 300, 0.5f);
        myStore.getListOfProducts().add(product0);
        myStore.getListOfProducts().add(product1);
        myStore.getListOfProducts().add(product2);

        chooseInTheListOfProducts();

    }


    public void chooseInTheListOfProducts() {

        int chooseItem;
        int chooseQuantity;
        int result;
        //String continueShopping;


        for (int i = 1; i < myStore.getListOfProducts().size(); i++) {
            System.out.println(myStore.getListOfProducts().get(i).getIndex() + " " + myStore.getListOfProducts().get(i).getName() + " "
                    + myStore.getListOfProducts().get(i).getQuantity() + " " + myStore.getListOfProducts().get(i).getPrice());
        }

        /*System.out.println("Press any key, or q to quit :");

        continueShopping = sc.nextLine();
        if(!continueShopping.equalsIgnoreCase("q"))*/

        chooseItem = sc.nextInt();

        while (chooseItem != 0) {

            if (myStore.getListOfProducts().get(chooseItem).getQuantity() == 0) {
                System.out.println("No more product available");

            } else {

                System.out.println(myStore.getListOfProducts().get(chooseItem).getIndex() + " " + myStore.getListOfProducts().get(chooseItem).getName());

                System.out.println("How much do you want ?");
                //Choose a quantity
                chooseQuantity = sc.nextInt();
                //Subtract the initial quantity to the chosen one
                result = myStore.getListOfProducts().get(chooseItem).getQuantity() - chooseQuantity;
                //Update the new quantity
                myStore.getListOfProducts().get(chooseItem).setQuantity(result);

                System.out.println("There is " + result + " left");

            }
            chooseInTheListOfProducts();
        }

    }
}

