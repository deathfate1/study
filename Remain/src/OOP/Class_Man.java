package OOP;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

class Man {

    int age;
    double weith;

    void speak(){
        System.out.println("Hello!");
    }
}

public class Class_Man {

    public static void main(String[] args) {

        Man man = new Man();

        man.speak();
        man.age = 18;
        man.weith = 57.3;

        System.out.println(man.age);
        System.out.println(man.weith + "\n");

        Man woman = new Man();

        woman.speak();
        woman.age = 18;
        woman.weith = 55;

        System.out.println(woman.age);
        System.out.println(woman.weith);
    }
}


