// ex:1
import java.util.*;

public class isbn {
    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the isbn code");
        String s = in.nextLine();
        int l = s.length();
        if (l != 10) {
            System.out.println("Invalid input");
        } else {
            process(s);
        }
    }

    void process(String s) {
        String ch;
        int a = 0, sum = 0, k = 10, l = s.length();
        for (int i = 0; i < l; i++) {
            ch = Character.toString(s.charAt(i));
            if (ch.equalsIgnoreCase("X")) {
                a = 10;
            } else {
                a = Integer.parseInt(ch);
                sum = sum + a * k;
                k--;
            }
           
        }
        System.out.println("OUTPUT: Sum =" + sum);
        if (sum % 11 == 0) {
            System.out.println("Leaves No Remainder -VALID ISBN CODE");
        } else {
            System.out.println("Leaves Remainder -INVALID ISBN CODE");
        }
    }

    public static void main(String[] args) {
        isbn obj1 = new isbn();
        obj1.input();
    }
}