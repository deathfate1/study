package OOP;

/**
 * @author Oskolkov Vlad
 * @version 13.03.19
 */

public class AbstractClass {
    public static void main(String[] args) {
        BookWarAndPeace b = new BookWarAndPeace();
        b.read();
    }
}

abstract class Book {

    protected int str;
    protected String author;

    protected abstract void read();
}

class BookWarAndPeace extends Book {
    protected  void read(){
        System.out.println("I love read book: War and Peace!");
    }

}