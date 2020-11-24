package object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreProducts {

    private final ArrayList<Product> products = new ArrayList<>();

    public StoreProducts() {
        this.initStoreProducts();
    }

    public ArrayList<Product> getProducts() {

        return products;
    }

    public void initStoreProducts() {

        Product product0 = new Product(0, "Case0", 50, 2);
        Product product1 = new Product(1, "Salad", 50, 2);
        Product product2 = new Product(2, "Pasta", 300, 0.5f);
        this.products.add(product0);
        this.products.add(product1);
        this.products.add(product2);




    }

    public void addElement() {

        /*Product product4 = new Product(3, "Orange", 55, 0.7f);
        Product product5 = new Product(4, "Cereals", 800, 1.5f);
        this.products.add(product4);
        this.products.add(product5);*/
        boolean isAdding = true;
        Product newProduct = null;
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> addNewProduct = new ArrayList<>();

        while (isAdding) {

            String addProduct = sc.nextLine();

            if (addProduct.equalsIgnoreCase("q")){
                isAdding = false;

            } else {

                System.out.println("Add a new product :");

                String newListOfProducts[] = addProduct.split("/");

                newProduct = new Product(Integer.parseInt(newListOfProducts[0].trim()), newListOfProducts[1].trim(), Integer.parseInt(newListOfProducts[2].trim()), Float.parseFloat(newListOfProducts[3].trim()));
            }


        }

        getProducts().add(newProduct);
        addNewProduct.addAll(getProducts());

    }
}


