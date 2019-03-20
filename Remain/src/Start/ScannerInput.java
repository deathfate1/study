package Start;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

public class ScannerInput {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

//        nextInt
//        nextByte
//        nextShort
//        nextLong
//        nextLine
//        nextBoolean
//        nextDouble
//        nextFloat
//        next          - слово

        System.out.print("Input something: ");
        System.out.println(scanner.nextLine() + "\n");

        System.out.print("Input something integer: ");
        System.out.println(scanner.nextInt() + "\n");

        System.out.print("Input something word: ");
        System.out.println(scanner.next() + "\n");


        /***************************************************/

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(line);

    }
}
