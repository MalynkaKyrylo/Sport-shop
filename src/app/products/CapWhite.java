package app.products;

import app.products.Cap;

public class CapWhite extends Cap {
    @Override
    public float price() {
        return 6.99f;
    }

    @Override
    public String name() {
        return "White Cap";
    }
}
