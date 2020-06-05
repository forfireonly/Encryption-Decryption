import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] inputArray = input.split(" ");
        int count = 0;
        int max = 0;
        String longestWord = "";
        for (String each : inputArray) {
            count = 0;
            char[] eachCharacterArray = each.toCharArray();
            count = eachCharacterArray.length;
            if (count > max) {
                max = count;
                longestWord = each;
            }
        }
        System.out.println(longestWord);
    }
}