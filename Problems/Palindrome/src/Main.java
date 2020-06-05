import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String newString = reader.readLine();
        char[] newStringCharArray = newString.toCharArray();
        boolean isPalidrome = true;
        int i = 0;
        while (true) {
            if (newStringCharArray[i] == newStringCharArray[newStringCharArray.length - i - 1]) {
                i++;
                if (i == newStringCharArray.length) {
                    break;
                }
            } else {
                isPalidrome = false;
                break;
            }
        }
        System.out.println(isPalidrome ? "yes" : "no");
    }
}