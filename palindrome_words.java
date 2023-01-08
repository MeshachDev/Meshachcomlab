
// ex:22
import java.util.*;

public class palindrome_words {
    String str;
    String[] s;

    palindrome_words() {
        str = "";
    }

    void input() {
        Scanner in = new Scanner(System.in);
        System.out.println("INPUT");
        str = in.nextLine();
        if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '?'
                || str.charAt(str.length() - 1) == '!') {
            s = str.split("[.?! ]");
        } else {
            System.out.println("INVALID INPUT!");
            input();
        }
    }

    String Convert(String[] s) {
        String converted = "";
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(reverse(s[i],1))) {
                converted += s[i] + " ";
            } else {
                if (s[i].charAt(s[i].length() - 1) == s[i].charAt(s[i].length() - 2)) {
                    for (int j = 0; j < s[i].length() - 1; j++) {
                        if (s[i].charAt(j) == s[i].charAt(j + 1)) {
                            converted += (s[i] + reverse(s[i].substring(j - 1),2) + " ");
                        }
                    }
                } else {
                    converted += (s[i] + reverse(s[i],2) + " ");
                }
            }
        }
        return converted;
    }

    static String reverse(String a,int b) {
        String rev = "";
        for (int i = a.length() - b; i >= 0; i--) {
            rev += a.charAt(i);
        }
        return rev;
    }

    void display() {
        System.out.println("OUTPUT " + Convert(s));
    }

    public static void main(String[] args) {
        palindrome_words obj22 = new palindrome_words();
        obj22.input();
        obj22.display();
    }
}
