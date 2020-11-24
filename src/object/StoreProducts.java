package object;
import java.util.ArrayList;

public class StoreProducts {

    private final ArrayList<Product> products = new ArrayList<>();

    public StoreProducts(){
        this.initStoreProducts();
    }

    public ArrayList<Product> getProducts(){
        return products;
    }

    public void initStoreProducts(){

        Product product0 = new Product(0, "Case0", 50, 2);
        Product product1 = new Product(1, "Salad", 50, 2);
        Product product2 = new Product(2, "Pasta", 300, 0.5f);
        this.products.add(product0);
        this.products.add(product1);
        this.products.add(product2);

    }
}
