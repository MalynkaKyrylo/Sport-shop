package app.products;

import app.products.Tshirt;

public class TshirtBlue extends Tshirt {
    @Override
    public float price() {
        return 22.99f;
    }

    @Override
    public String name() {
        return "Blue T-shirt";
    }
}
