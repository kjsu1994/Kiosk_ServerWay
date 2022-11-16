package app.product.subproduct;

import app.product.Product;

public class Sandwich extends Product {
    private boolean set;
    private int setPrice;

    public Sandwich(int id, String name, int price, int kcal, boolean set, int setPrice) {
        super(id, name, price, kcal);
        this.set = set;
        this.setPrice = setPrice;
    }
}
