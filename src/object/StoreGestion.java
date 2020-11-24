package object;

import java.util.Scanner;

public class StoreGestion {

    Scanner sc = new Scanner(System.in);

    int chooseItem;
    int chooseQuantity;
    int result;
    boolean isChoosing = true;
    String chooseToContinue;

    public StoreGestion() {

        StoreProducts allProducts = new StoreProducts();

        while (isChoosing) {

            System.out.println("This is a list of products available :");

            for (int i = 1; i < allProducts.getProducts().size(); i++) {
                System.out.println(allProducts.getProducts().get(i).getIndex() + " " + allProducts.getProducts().get(i).getName() + " "
                        + allProducts.getProducts().get(i).getQuantity() + " " + allProducts.getProducts().get(i).getPrice());
            }

            System.out.println("Continue (c) or Quit (q) ?");
            chooseToContinue = sc.nextLine();

            if (chooseToContinue.equalsIgnoreCase("q")) {
                isChoosing = false;

            } else if (chooseToContinue.equalsIgnoreCase("c")) {

                System.out.println("Choose item");
                chooseItem = sc.nextInt();

                if (allProducts.getProducts().get(chooseItem).getQuantity() == 0) {
                    System.out.println("No more product available");

                } else {

                    System.out.println(allProducts.getProducts().get(chooseItem).getIndex() + " " + allProducts.getProducts().get(chooseItem).getName());

                    System.out.println("How much do you want ?");
                    //Choose a quantity
                    chooseQuantity = sc.nextInt();
                    //Subtract the initial quantity to the chosen one
                    result = allProducts.getProducts().get(chooseItem).getQuantity() - chooseQuantity;
                    //Update the new quantity
                    allProducts.getProducts().get(chooseItem).setQuantity(result);

                    System.out.println("There is " + result + " left");
                }
            }
        }

    }

}


