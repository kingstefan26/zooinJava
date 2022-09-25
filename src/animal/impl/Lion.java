package animal.impl;

import animal.IAnimal;

public class Lion implements IAnimal {
    @Override
    public void sound() {
        System.out.println("RAWR");
    }

    @Override
    public void eat(String foodname) {
        return;
    }

    @Override
    public boolean caneat(String name) {
        return switch (name) {
            case "meat" -> true;
            case "PoisonMushrom" -> false;
            default -> false;
        };
    }
}
