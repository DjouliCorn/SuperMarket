package application;
import object.Product;
import object.StoreGestion;
import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    ArrayList<Product> cartItems = new ArrayList<>(4);
    static ArrayList<Product> cartItemsAdmin = new ArrayList<>(4);
    static int totalPrice = 0;
    static int finalPrice = 0;

    public void addToCart(Product product){
        cartItems.add(product);
    }

    /*public void totalCartItems(){

        System.out.println("Here the products in the cart :");

        for (Product prod: cartItems) {

            System.out.println(prod.getIndex()+" "+prod.getName()+" "+prod.getQuantity()+" "+(prod.getPrice()*prod.getQuantity()));
            //calculate the total price of items stored in the cart
            totalPrice += (prod.getPrice()*prod.getQuantity());
        }

        System.out.println("The total price : "+totalPrice);

        printCartItems();
    }*/

    public void printCartItems(){

        System.out.println("Here the products in the cart :");

        for (Product prod: cartItems) {

            System.out.println(prod.getIndex()+" "+prod.getName()+" "+prod.getQuantity()+" "+(prod.getPrice()*prod.getQuantity()));
            //calculate the total price of items stored in the cart
            totalPrice += (prod.getPrice()*prod.getQuantity());
            finalPrice += (prod.getPrice()*prod.getQuantity());
        }


        System.out.println("The total price : "+totalPrice);

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
            totalPrice =0;

        } else {
            System.out.println("Wrong input");
        }
    }

    public static void orderListAdmin(){

        System.out.println("Client name");
        System.out.println(Login.clientRegister.getFirstName());

        System.out.println("Client purchase :");
        for (Product clientPurchase:cartItemsAdmin) {
            System.out.println(clientPurchase.getName()+" "+clientPurchase.getQuantity()+" "
                    +(clientPurchase.getPrice()*clientPurchase.getQuantity()));
        }

        System.out.println("Total price of the purchase : "+finalPrice);
        System.out.println(" ");
    }
}
