package DataStructures;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Oskolkov Vlad
 * @version 15.03.19
 */

public class Vec {

    public static void main(String[] args) {

        Vector vec = new Vector();

        vec.addElement(1);
        vec.addElement(2);
        vec.addElement(3);
        vec.addElement(4);
        vec.addElement(5);
        vec.addElement(6);
        vec.addElement(7);

        System.out.println(vec.get(1) +"\n" + vec.get(6));

        Enumeration e = vec.elements();

        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
