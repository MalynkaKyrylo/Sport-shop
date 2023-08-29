package app.products;

import app.products.Tshirt;

public class TshirtRed extends Tshirt {
    @Override
    public float price() {
        return 21.99f;
    }

    @Override
    public String name() {
        return "Red T-shirt";
    }
}
