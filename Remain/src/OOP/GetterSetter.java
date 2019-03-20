package OOP;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

public class GetterSetter {
    public static void main(String[] args) {
        Animal a = new Animal();

        a.setNumFoot(4);
        System.out.println(a.getNumFoot());
    }

}

class Animal {
    private int numFoot;

//    Getter
    public int getNumFoot(){
        return numFoot;
    }

//    Setter
    public void setNumFoot(int numFoot){
        this.numFoot = numFoot;
    }
}