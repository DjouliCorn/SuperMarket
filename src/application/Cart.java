package application;
import object.Product;
import object.StoreGestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {

    ArrayList<Product> cartItems = new ArrayList<>(4);
    static ArrayList<Product> cartItemsAdmin = new ArrayList<>(4);
    static int totalPrice = 0;
    //static ArrayList<String> clientName = new ArrayList<>();
    //static ArrayList<Product> allClientPurchase = new ArrayList<>();


    public void addToCart(Product product){
        cartItems.add(product);
    }

    public void printCartItems(){

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
            cartItemsAdmin.addAll(cartItems);
            //erase the cart after the customer buys the products
            cartItems.clear();

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

        System.out.println("Total price of the purchase : "+totalPrice);
        System.out.println(" ");
    }



    /*public static void orderListAdminMenu(){

        Scanner sc = new Scanner(System.in);
        int numIndex;
        int i;

        for (i = 1; i < clientName.size(); i++) {
            clientName.add(Login.clientRegister.getFirstName());
        }

        System.out.println(clientName.get(i)+" "+clientName);

        for (int i = 1; i < allClientPurchase.size(); i++) {
           allClientPurchase.addAll(cartItemsAdmin);
        }

        for (i = 1; i < clientName.size(); i++) {
            System.out.println("Enter the index of the customer :");
            numIndex = sc.nextInt();
            i = numIndex;

            String name = clientName.get(i);
            System.out.println(name);
        }

        public E get(int index) {
            Objects.checkIndex(index, size);
            return elementData(index);
        }

        for (int i = 0; i < clientName.size(); i++) {

        }
    }*/
}
