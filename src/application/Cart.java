package application;
import object.Product;

import java.util.ArrayList;

public class Cart {

    ArrayList<Product> cartItems = new ArrayList<>();

    /*private Product getProductByIndex(int setIndex) {
        Product product = null;
        ArrayList<Product> products = new StoreProducts().getProducts();
        for (Product prod: products) {
            if (prod.getIndex() == setIndex) {
                product = prod;
                break;
            }
        }
        return product;
    }*/

    public void addToCart(Product product){
        cartItems.add(product);
    }

    public void printCartItems(){
        for (Product prod: cartItems) {
            System.out.println(prod.getName());
        }
    }
}
