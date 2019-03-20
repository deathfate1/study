package DataStructures;

import java.util.BitSet;

/**
 * @author Oskolkov Vlad
 * @version 15.03.19
 */

public class Bitset {

    public static void main(String[] args) {

        BitSet b1 = new BitSet(2);
        BitSet b2 = new BitSet(2);

        b1.set(0, false);
        b1.set(1, true);

        b2.set(0, true);
        b2.set(1, false);

        System.out.println(b1);
        System.out.println(b2);

        b1.and(b2);
        System.out.println(b1);
        b1.or(b2);
        System.out.println(b1);
        b1.xor(b2);
        System.out.println(b1);
    }
}
