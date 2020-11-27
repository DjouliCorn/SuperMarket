package application;
import object.Product;
import object.StoreGestion;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    //The arraylist where the products are stocked
    ArrayList<Product> cartItems = new ArrayList<>(4);

    //The arraylist created to allow the administrator to see the purchases of the customer
    static ArrayList<Product> cartItemsAdmin = new ArrayList<>(4);
    static int totalPrice = 0;


    //Add the product that the customer bought to the cart
    public void addToCart(Product product){
        cartItems.add(product);
    }

    //Print the customer's cart with the purchases
    public void printCartItems(){

        System.out.println("Here the products in the cart :");
        totalPrice = 0;
        for (Product prod: cartItems) {

            System.out.println(prod.getIndex()+" "+prod.getName()+" "+prod.getQuantity()+" "+(prod.getPrice()*prod.getQuantity()));
            //calculate the total price of items stored in the cart
            totalPrice += (prod.getPrice()*prod.getQuantity());
        }

        //The total price of all the purchases
        System.out.println("The total price : "+totalPrice);

        //The customer can choose to continue the purchase or buy what's in his cart
        System.out.println("Continue to choose products (c) or pay (p) :");

        Scanner sc = new Scanner(System.in);
        String chooseCart = sc.nextLine();

        if (chooseCart.equalsIgnoreCase("c")){
            StoreGestion.buyElement();

        } else if (chooseCart.equalsIgnoreCase("p")){
            System.out.println("Thank you for your purchase, see you soon !");
            cartItemsAdmin.addAll(cartItems);
            //erase the cart after the customer buys the products
            cartItems.clear();

        } else {
            //If the customer doesn't choose c or p
            System.out.println("Wrong input");
        }
    }

    //The cart that is stock in the admin account allow him to see the name of the customer and what he has bought,
    // with the quantity and the final price

    public static void orderListAdmin(){

        System.out.println("Client name");
        System.out.println(Login.clientRegister.getFirstName());

        System.out.println("Client purchase :");
        for (Product clientPurchase:cartItemsAdmin) {
            System.out.println(clientPurchase.getName()+" "+clientPurchase.getQuantity()+" "
                    +(clientPurchase.getPrice()*clientPurchase.getQuantity()));
        }

        System.out.println("Total price of the purchase : "+totalPrice);
        System.out.println(" ");
    }
}
