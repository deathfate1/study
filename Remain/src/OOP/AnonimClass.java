package OOP;

/**
 * @author Oskolkov Vlad
 * @version 13.03.19
 */

public class AnonimClass {

    public static void main(String[] args) {
        Machine m = new Machine(){
            @Override public void start(){
                System.out.println("Start...Hello, the man!");
            }
        };

        m.start();
    }
}

class Machine {
    public void start(){
        System.out.println("Start...");
    }
}