package org.example;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{new Eagle(), new Martin(), new Penguin(), new Chicken()};

        for(Bird bird : birds){
            bird.getLogger().info("Feathers: " + bird.getFeathers());
            bird.getLogger().info("Lays eggs: " + bird.laysEggs());
            bird.fly();
        }
    }
}

class Eagle extends FlyingBird {
    public Eagle() {
        super("Eagles feathers are dark brown to black and provide exceptional lift and maneuverability during flight.", true);
    }

    @Override
    public void fly() {
        getLogger().info("Eagles are very good pilots - they fly high and fast.");
    }
}

class Martin extends FlyingBird {
    public Martin() {
        super("Martin feathers are sleek, designed for reduced air resistance.", true);
    }

    @Override
    public void fly() {
        getLogger().info("Swallows do not fly as high as eagles, but they are more maneuverable.");
    }
}

class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Penguin have a distinctive tuxedo-like appearance with black backs and white bellies.", true);
    }

    @Override
    public void fly() {
        getLogger().info("Penguins don't fly, but harsh conditions taught them to swim.");
    }
}

class Chicken extends NonFlyingBird {
    public Chicken() {
        super("Chickens feathers serve various functions, including insulation, protection, and display.", true);
    }

    @Override
    public void fly() {
        getLogger().info("Chickens do not fly or swim, unlike penguins, they can only fly a little.");
    }
}