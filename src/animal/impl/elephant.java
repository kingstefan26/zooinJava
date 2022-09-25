package animal.impl;

import animal.IAnimal;

public class elephant implements IAnimal {
    @Override
    public void sound() {
        System.out.println("HOOOOFFFF");
    }

    @Override
    public void eat(String foodname) {
        switch (foodname){
            case "bananaleafs":
                System.out.println("gained 3 food points");
            case "meat":
                System.out.println("gained 1 food point");
        }
    }

    @Override
    public boolean caneat(String name) {
        return switch (name){
            case "leaf" -> true;
            case "meat" -> true;
            case "mooszroom" -> false;
            default -> false;
        };
    }
}
