package DataStructures;

import java.util.Stack;

/**
 * @author Oskolkov Vlad
 * @version 15.03.19
 */

public class DStack {

    public static void main(String[] args) {

//        LIFO
        Stack stk = new Stack();

        stk.push(1);
        stk.push(3.3);
        stk.push("Vlad");

        System.out.println(stk);
        System.out.println(stk.get(0));
        System.out.println(stk.get(2) + "\n");

        System.out.println(stk.pop());
        System.out.println(stk);
    }
}



