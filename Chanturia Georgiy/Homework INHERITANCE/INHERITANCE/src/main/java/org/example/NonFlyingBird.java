package org.example;
import java.util.logging.Logger;

public class NonFlyingBird extends Bird {
    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        getLogger().info("\"This bird can not fly.\"");
    }
}
