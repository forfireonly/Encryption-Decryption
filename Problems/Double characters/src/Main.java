import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String singleString = reader.readLine();
        String[] singleStringArray = singleString.split("");
        StringBuilder doubleString = new StringBuilder();
        for (String each : singleStringArray) {
            doubleString.append(each).append(each);
        }
        System.out.println(doubleString);
    }
}