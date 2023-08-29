package app.products;

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
