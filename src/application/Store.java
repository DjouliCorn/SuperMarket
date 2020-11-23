package application;

import object.Products;

import java.util.ArrayList;

public class Store {

    ArrayList<Products> listOfProducts = null;

    public Store(){
        listOfProducts = new ArrayList<>();
    }

    public ArrayList<Products> getListOfProducts() {
        return listOfProducts;
    }

}
