package app.products;

import app.producers.Producer;

public interface Item {
    String name();
    Producer producer();
    float price();
}
