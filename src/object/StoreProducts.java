package object;
import java.util.ArrayList;

public class StoreProducts {

    private final ArrayList<Product> products = new ArrayList<>();

    //The products are available at the start of the program
    public StoreProducts() {

        Product product0 = new Product(0, "Case0", 50, 2);
        Product product1 = new Product(1, "Salad", 50, 2);
        Product product2 = new Product(2, "Pasta", 300, 0.5f);
        this.getProducts().add(product0);
        this.getProducts().add(product1);
        this.getProducts().add(product2);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}


