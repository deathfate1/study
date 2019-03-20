package OOP;

/**
 * @author Oskolkov Vlad
 * @version 13.03.19
 */

public class Interfeses implements Animall, Animalll {

    public void sound(){
        System.out.println("Grrr");
    }

    public void run(){
        System.out.println("Animal run with " + legs + " legs...");
    }
    public static void main(String[] args) {
        Interfeses i = new Interfeses();
        i.sound();
        i.run();
    }
}

interface Animall {
    int legs = 4;
    void sound();
}

interface Animalll {
    void run();
}
