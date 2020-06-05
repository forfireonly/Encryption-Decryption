import java.util.*;

public class Main {

    static void passwordBuild(int limit, String one, String two, StringBuilder password) {
        int cutOff = limit;
        while (cutOff > 0) {
            if (cutOff % 2 == 0) {
                password.append(one);
            } else {
                password.append(two);
            }
            cutOff--;
        }

    }
    public static void main(String[] args) {
        // write your code here
        StringBuilder password = new StringBuilder();
        Scanner scn = new Scanner(System.in);
        int aUpperCase = scn.nextInt();
        int bLowerCase = scn.nextInt();
        int cDigits = scn.nextInt();
        int nSymbols = scn.nextInt();

        passwordBuild(aUpperCase, "A", "B", password);

        passwordBuild(bLowerCase, "a", "b", password);

        passwordBuild(cDigits, "1", "2", password);

        if (password.length() != nSymbols) {
            int dif = Math.abs(password.length() - nSymbols);
            passwordBuild(dif, "B", "A", password);
        }
        System.out.println(password);
    }
}