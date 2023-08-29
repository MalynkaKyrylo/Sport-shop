package app.products;

import app.producers.ActiveSports;
import app.producers.Producer;

public abstract class Tshirt implements Item {
    @Override
    public Producer producer() {
        return new ActiveSports();
    }
}
