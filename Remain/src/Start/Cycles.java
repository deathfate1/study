package Start;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

// Для выхода из цикла - break
// Для перехода к следующей итерации - continue

public class Cycles {
    public static void main(String[] args) {

//        Итерационный цикл
        int[] aArr = new int[10];

        for (int i = 0; i < 10; i++) {
            aArr[i] = 5;
            System.out.println("a[" + i + "] = " + aArr[i]);
        }

        System.out.println();


//        Улучшенный итерационный цикл
        int[] bArr = new int[10];

        for (int b : bArr){
            b = 5;
            System.out.println("b = " + b);
        }

        System.out.println();


//        Цикл с предусловием
        int a = 5;

        while (a > 0){
            System.out.println(a);
            a--;
        }

        System.out.println();

        int b = 5;

//        Цикл с постусловием
        do {
            System.out.println(b);
            b--;
        } while (b > 0);
    }
}
