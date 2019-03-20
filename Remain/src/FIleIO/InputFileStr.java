package FIleIO;

import java.io.*;

/**
 * @author Oskolkov Vlad
 * @version 13.03.19
 */

public class InputFileStr {

    public static void main(String[] args) throws IOException {

        // Byte Stream
        FileInputStream in = new FileInputStream("/home/deathfate/IdeaProjects/Remain/out/production/Remain/FIleIO/input.txt");

        int number;
        while ((number = in.read()) != -1)
            System.out.println(number);

        FileOutputStream out = new FileOutputStream("/home/deathfate/IdeaProjects/Remain/out/production/Remain/FIleIO/output.txt");
        out.write(65);

        /********************************************************************/
        /********************************************************************/
        /********************************************************************/

        // Character Stream
        FileReader in1 = new FileReader("/home/deathfate/IdeaProjects/Remain/out/production/Remain/FIleIO/input.txt");

        int number1;
        while ((number1 = in1.read()) != -1)
            System.out.println(number1);

        FileWriter out1 = new FileWriter("/home/deathfate/IdeaProjects/Remain/out/production/Remain/FIleIO/output.txt");
        out1.write(65);

        /********************************************************************/
        /********************************************************************/
        /********************************************************************/

        // Standard Stream
        InputStreamReader in2 = new InputStreamReader(System.in);

        char ch;

        do {
            ch = (char)in2.read();
            System.out.println(ch);
        } while (ch != 'e');

        in2.close();
    }
}
