package app.orders;

import app.products.CapBlack;
import app.products.CapWhite;
import app.products.TshirtBlue;
import app.products.TshirtRed;

public class OrderBuilder {
    public Order prepareOrderA() {
        Order order = new Order();
        order.addItem(new TshirtRed());
        order.addItem(new CapWhite());
        return order;
    }

    public Order prepareOrderB() {
        Order order = new Order();
        order.addItem(new TshirtBlue());
        order.addItem(new CapBlack());
        return order;
    }
}
