package Start;

import java.util.regex.*;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

public class RegularExpressions {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("c..");
        Matcher mat = pat.matcher("cat");

        boolean res = mat.matches();
        System.out.println(res);
    }
}
