package animal.impl;

import animal.IAnimal;

public class parrot implements IAnimal {
    @Override
    public void sound() {
        System.out.println("KWA");
    }

    public void sound(String whatdidyousay) {
        System.out.println(whatdidyousay);
    }

    @Override
    public void eat(String foodname) {
        switch (foodname){
            case "penut":
                System.out.println("Gained 2 food points");
            default:
                System.out.println("Gaoined 1 food point");
        }
    }

    @Override
    public boolean caneat(String name) {
        return switch (name){
            case "meat" -> false;
            case "penut" -> true;
            default -> true;
        };
    }
}
