package object;
import application.Cart;
import application.ClientMenu;
import java.util.Scanner;


public class StoreGestion {

    public static Cart clientCart = new Cart();
    static Scanner sc = new Scanner(System.in);
    static int chooseItem;
    static int chooseQuantity;
    static int result;
    static StoreProducts allProducts = new StoreProducts();


    public static void addElement() {

        boolean isAdding = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("Add a new product or Quit (q):");

        while (isAdding) {

            String addProduct = sc.nextLine();

            if (addProduct.equalsIgnoreCase("q")) {
                isAdding = false;

            } else {

                System.out.println("Add a new product or Quit (q):");

                String newListOfProducts[] = addProduct.split("/");

                Product newProduct = new Product(Integer.parseInt(newListOfProducts[0].trim()), newListOfProducts[1].trim(), Integer.parseInt(newListOfProducts[2].trim()), Float.parseFloat(newListOfProducts[3].trim()));
                allProducts.getProducts().add(newProduct);
            }
        }

        System.out.println("Entire list of products :");
        for (int i = 1; i < allProducts.getProducts().size(); i++) {
            System.out.println(allProducts.getProducts().get(i).getIndex() + " " + allProducts.getProducts().get(i).getName());

        }
    }

    public static void buyElement() {

        String chooseToContinue;
        boolean isChoosing = true;

        //While the customer is choosing an item, and while is choosing is still true,...
        while (isChoosing) {

            System.out.println(" ");
            System.out.println("This is a list of products available :");
            System.out.println(" ");

            //The list of products which are available with the index, the name, the quantity and the price by unit
            for (int i = 1; i < allProducts.getProducts().size(); i++) {
                System.out.println(allProducts.getProducts().get(i).getIndex() + " " + allProducts.getProducts().get(i).getName() + " "
                        +allProducts.getProducts().get(i).getQuantity()+"       "+allProducts.getProducts().get(i).getPrice()+" €/unit");
            }

            /*The customer chooses if he wants to continue to buy items by pressing the c key
            or to quit the store by pressing the q key. The entries are not case sensitive.*/

            System.out.println(" ");
            System.out.println("Continue (c) or Quit (q) ?");

            Scanner newSC = new Scanner(System.in);
            chooseToContinue = newSC.nextLine();

            //If the user chooses q, he goes back to the client menu
            if (chooseToContinue.equalsIgnoreCase("q")) {
                isChoosing = false;
            }

            //If the user chooses c, he can continue to buy items
            if (chooseToContinue.equalsIgnoreCase("c")) {

                //Choose item by the ID
                System.out.println("Choose item");
                chooseItem = sc.nextInt();

                //If the stock of items is equal or less than 0, a message pops up
                if (allProducts.getProducts().get(chooseItem).getQuantity() <= 0) {
                    System.out.println("No more product available");

                } else {

                    //The list of items available
                    System.out.println(allProducts.getProducts().get(chooseItem).getIndex()+" "
                            +allProducts.getProducts().get(chooseItem).getName()+" "
                            +allProducts.getProducts().get(chooseItem).getQuantity()+"       "+allProducts.getProducts().get(chooseItem).getPrice()+" €/unit");

                    System.out.println("How much do you want ?");

                    //Choose a quantity
                    chooseQuantity = sc.nextInt();

                    //If the user wants more items than available, error message pops up
                    if (chooseQuantity > allProducts.getProducts().get(chooseItem).getQuantity()){
                        System.out.println("Not enough items in stock.");

                    } else {

                        //Subtract the initial quantity to the chosen one
                        result = allProducts.getProducts().get(chooseItem).getQuantity() - chooseQuantity;

                        //Update the new quantity in the product list
                        allProducts.getProducts().get(chooseItem).setQuantity(result);

                        //Add the product in the cart
                        clientCart.addToCart(new Product(
                                allProducts.getProducts().get(chooseItem).getIndex(),
                                allProducts.getProducts().get(chooseItem).getName(),
                                chooseQuantity,
                                allProducts.getProducts().get(chooseItem).getPrice()));
                    }
                }
            }
            //If the user writes something else, a error message pops up
            if (!chooseToContinue.equalsIgnoreCase("q") && !chooseToContinue.equalsIgnoreCase("c")){
                System.out.println("Wrong input !");
            }
        }
        //When the customer wants to quit the buying session, he comes back to the client menu
        new ClientMenu();
    }
}




