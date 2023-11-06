package org.example;

import java.util.logging.Logger;

public class FlyingBird extends Bird {
    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        getLogger().info("This bird can fly.");
    }
}
