package Start;

/**
 * @author Oskolkov Vlad
 * @version 12.03.19
 */

public class ConditionOperator {
    public static void main(String[] args) {
        int a = 4, b = 5, c = 1;
        int age = 18;

        if (a > b)
            System.out.println(a);
        else if (b > c)
            System.out.println(b);
        else
            System.out.println(c);

        switch (age){
            case 10:
                System.out.println("Young");
                break;
            case 18:
                System.out.println("Student");
                break;
            case 30:
                System.out.println("Middle");
                break;
            case 80:
                System.out.println("Old");
                break;
            default:
                System.out.println("Do more conditions...");
        }
    }
}
