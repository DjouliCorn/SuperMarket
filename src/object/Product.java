package object;
public class Product {

    private int index;
    private String name;
    private int quantity;
    private float price;

    //Structure of a product

    public Product(int index, String name, int quantity, float price) {
        this.index = index;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {

        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
