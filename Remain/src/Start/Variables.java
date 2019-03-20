package Start;

import java.util.Date;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

// Каждая строчка должна быть запущена в классе
public class Variables {
    // Точка входа программы
    public static void main(String[] args) {
        int i = 9;
        boolean b = true;
        double d = 6.1;
        long l = 1000000;
        char c = 'V';

        // Сылочная переменная
        String s = "Hello, World!";

        // Константы
        final float pi = 3.14159f;

        // Класс System и его поток out
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);
        System.out.println(l);
        System.out.println(c);

        System.out.println("\n" + s);

        System.out.println("\n" + pi);

        Date date = new Date();
        System.out.println(date.toString());
    }
}
