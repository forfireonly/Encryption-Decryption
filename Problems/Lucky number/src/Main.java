import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        String[]numberArray = number.split("");
        int firstHalf = 0;
        int secondHalf = 0;
        for (int i = 0; i < numberArray.length / 2; i++) {
            firstHalf += Integer.parseInt(numberArray[i]);
        }
        for (int i = numberArray.length / 2; i < numberArray.length; i++) {
            secondHalf += Integer.parseInt(numberArray[i]);
        }
        if (firstHalf == secondHalf) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}