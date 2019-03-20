package DataStructures;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Properties;

/**
 * @author Oskolkov Vlad
 * @version 15.03.19
 */

public class PropetiesHashtable {

    public static void main(String[] args) {

        Properties propeties = new Properties();
        Hashtable hashtable = new Hashtable();

        propeties.put(1, "One");
        propeties.put(2, "Two");
        propeties.put(3, "Three");

        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        System.out.println(propeties);
        System.out.println(hashtable);

        Iterator i = propeties.keySet().iterator();

        int key;
        while (i.hasNext()){
            key = (int)i.next();
            System.out.println(key + " " + propeties.get(key));
        }

        Enumeration e = hashtable.keys();

        while (e.hasMoreElements()){
            key = (int)e.nextElement();
            System.out.println(key + " " + hashtable.get(key));
        }
    }
}
