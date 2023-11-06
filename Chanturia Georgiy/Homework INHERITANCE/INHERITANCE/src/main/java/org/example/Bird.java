package org.example;

import java.util.logging.Logger;

public abstract class Bird {
    private Logger logger = Logger.getLogger(getClass().getName());
    private String feathers;
    private boolean layEggs;

    protected Bird(String feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    protected Logger getLogger() {
        return logger;
    }

    public abstract void fly();

    public String getFeathers() {
        return feathers;
    }

    public boolean laysEggs() {
        return layEggs;
    }
}
