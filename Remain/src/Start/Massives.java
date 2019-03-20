package Start;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

public class Massives {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] cArr = {1, 2, 4, 6, 9};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println();
        System.out.println(arr[4] + arr[0]);
        System.out.println(cArr[3]);
        System.out.println("Длина массива arr равна = " + arr.length);

        System.out.println();

        // Двухмерные массивы
        int[][] longArr = new int[3][2];

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 1; j++) {
                longArr[i][j] = 0;
                System.out.print(longArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] longArr1 = new int[3][2];

        for (int[] lArr : longArr1){
            lArr = new int[]{1, 2, 3};
        }

        int[][] longArr2 = {{1, 2, 3}, {1}, {1, 2, 3, 4, 5}};
    }
}
