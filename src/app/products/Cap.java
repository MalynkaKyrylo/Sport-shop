package app.products;

import app.producers.SmartCaps;
import app.producers.Producer;

public abstract class Cap implements Item {
    @Override
    public Producer producer() {
        return new SmartCaps();
    }
}
