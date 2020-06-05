import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        String subString = reader.readLine();
        int numberOfOccurences = 0;
        int endIndex = subString.length();
        for (int i = 0; i <= string.length() - subString.length(); i++) {
            if (string.substring(i, endIndex).equals(subString)) {
                numberOfOccurences++;
            }
            if (endIndex  < string.length()) {
                endIndex += 1;
            }
        }
        System.out.println(numberOfOccurences);
    }
}