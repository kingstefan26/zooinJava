import animal.IAnimal;
import animal.impl.Lion;
import animal.impl.elephant;
import animal.impl.parrot;

public class Main {
    public static void main(String[] args) {
        IAnimal elephant = new elephant();
        IAnimal lion = new Lion();
        IAnimal parrot = new parrot();


        System.out.println("Can elepant eat banana leafs: " + elephant.caneat("bananaleafs"));

        lion.sound();

        parrot.eat("penut");

    }
}