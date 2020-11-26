package application;
import object.Product;
import object.StoreGestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    ArrayList<Product> cartItems = new ArrayList<>();


    public void addToCart(Product product){
        cartItems.add(product);
    }

    public void printCartItems(){

        int totalPrice = 0;

        System.out.println("Here the products in the cart :");

        for (Product prod: cartItems) {

            System.out.println(prod.getIndex()+" "+prod.getName()+" "+prod.getQuantity()+" "+(prod.getPrice()*prod.getQuantity()));

            //calculate the total price of items stored in the cart
            totalPrice += (prod.getPrice()*prod.getQuantity());
        }

        System.out.println("The total price : "+totalPrice);

        System.out.println("Continue to choose products (c) or pay (p) :");

        Scanner sc = new Scanner(System.in);
        String chooseCart = sc.nextLine();

        if (chooseCart.equalsIgnoreCase("c")){
            StoreGestion.buyElement();

        } else if (chooseCart.equalsIgnoreCase("p")){

            System.out.println("Thank you for your purchase, see you soon !");


            //erase the cart after the customer buys the products
            cartItems.clear();
        }
    }
}
