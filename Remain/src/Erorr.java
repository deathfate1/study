/**
 * @author Oskolkov Vlad
 * @version 13.03.19
 */

public class Erorr {
    public static void main(String[] args) {

        int[] arr = new int[5];

        try{
            System.out.println(arr[5]);
            int i = 10 / 0;
        }
        catch (ArrayIndexOutOfBoundsException err){
            System.out.println("Вы вышли за пределы массива!");
            System.out.println(err + "\n");
        }
        catch (ArithmeticException err){
            System.out.println("Нельзя делить на ноль!");
            System.out.println(err + "\n");
        }
        finally {
            System.out.println("Я обязательно выполнюсь!!!!\n");
        }

        try{
            test();
        }
        catch (ArithmeticException err){
            System.out.println(err);
            System.out.println("ERORR!!!\n");
        }

        try{
            throw new MyException("Hi, I'm Vlad exception");
        }
        catch (MyException err){
            System.out.println(err);
        }
    }

    public static void test () throws ArithmeticException {
        throw new ArithmeticException();
    }
}

class MyException extends Exception {

    public String s;

    MyException (String s){
        this.s = s;
    }

    public String toString(String s){
        return ("My exception:" + s);
    }
}