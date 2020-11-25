package application;
import object.Product;

import java.util.ArrayList;

public class Cart {

    ArrayList<Product> cartItems = new ArrayList<>();


    public void addToCart(Product product){
        cartItems.add(product);
    }

    public void printCartItems(){
        for (Product prod: cartItems) {
            System.out.println(prod.getIndex()+" "+prod.getName()+" "+prod.getQuantity()+" "+(prod.getPrice()*prod.getQuantity()));
        }
    }
}
