package app;

import app.orders.Order;
import app.orders.OrderBuilder;

public class Main {
    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        Order orderA = orderBuilder.prepareOrderA();
        System.out.println("Order A");
        orderA.showItems();
        System.out.println("Total Cost: USD " + orderA.getCost());

        Order orderB = orderBuilder.prepareOrderB();
        System.out.println("\nOrder B");
        orderB.showItems();
        System.out.println("Total Cost: USD " + orderB.getCost());
    }
}
