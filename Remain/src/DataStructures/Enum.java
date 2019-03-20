package DataStructures;

/**
 * @author Oskolkov Vlad
 * @version 15.03.19
 */

public class Enum {

    public enum names{
        Sergey,
        Misha,
        Vlad,
        Olya
    }

    public static void main(String[] args) {

        System.out.println(names.Vlad);

        names cm = names.Olya;

        if (cm == names.Olya)
            System.out.println("True");
    }
}
