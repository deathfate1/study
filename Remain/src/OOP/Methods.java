package OOP;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

//Переопределение методов (не static, не final, не конструкторы, одинаковое название и набор аргументов)
//Перегрузка (разный набор аргументов)

public class Methods {

    static void printWords(){
        System.out.println("Yeah, boy!");
    }

    static void sayMyName(String name){
        System.out.println("Hello, " + name + "!");
    }

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        printWords();
        sayMyName("Vlad");
        System.out.println(sum(5,5));
    }
}
