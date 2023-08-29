package app.products;

import app.products.Cap;

public class CapBlack extends Cap {
    @Override
    public float price() {
        return 5.99f;
    }

    @Override
    public String name() {
        return "Black Cap";
    }
}
