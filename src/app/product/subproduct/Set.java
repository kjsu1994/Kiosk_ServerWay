package app.product.subproduct;

import app.product.Product;
import app.product.subproduct.Drink;
import app.product.subproduct.Sandwich;
import app.product.subproduct.Side;

import java.util.PrimitiveIterator;

public class Set extends Product {
    private Sandwich sandwich;
    private Drink drink;
    private Side side;

    public Sandwich getSandwich(){
        return sandwich;
    }

    public Set(int id, String name, int price, int kcal, Sandwich sandwich, Drink drink, Side side) {
        super(id, name, price, kcal);
        this.sandwich = sandwich;
        this.drink = drink;
        this.side = side;
    }

    public Drink getDrink() {
        return drink;
    }

    public Side getSide() {
        return side;
    }
}
