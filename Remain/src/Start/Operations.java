package Start;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

public class Operations {
    public static void main(String[] args) {
        int a = 1, b = 4, c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = b / a;
        System.out.println(c);

        // Деление по модулю
        c = b % a;
        System.out.println(c);

        // Префикс инкремента: сначала происходит увеличение "a", а потом присваивание
        c = ++a;
        System.out.println(c);

        // Постфикс инкремента: сначала происходит присваивание, а потом увеличение "а"
        c = a++;
        System.out.println(c);

        // Conditional perator
        int res = (b > a) ? 55 : 666;
        System.out.println(res);

        char ch = 'd';

        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.toUpperCase(ch));
    }
}
