package OOP;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

public class Constructor {
    public static void main(String[] args) {
        People p1 = new People();
        People p2 = new People(22, 55);

        System.out.println(p1.getAge());
        System.out.println(p2.getAge());


        Child child1 = new Child(10, 20, "Vlad");
        Child child2 = new Child();

        System.out.println(child1.getAge());
        System.out.println(child2.getAge());

    }
}

class People {

    People(){
        this.age    = 18;
    }

    People(int age, int weith){
        this.setAge(age);
        this.setWeith(weith);
    }

    protected int age;
    protected int weith;

//    Getter
    public int getAge(){
        return age;
    }
//    Setter
    public void setAge(int age){
        this.age = age;
    }

//    Getter
    public int getWeith(){
        return weith;
    }
//    Setter
    public void setWeith(int weith){
        this.weith = weith;
    }
}

class Child extends People {

    Child(){ }

    Child(int age, int weith, String name){
        this.setAge(age);
        this.setWeith(weith);
        this.name = name;
    }

    private String name;
}