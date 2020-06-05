import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        String[] dateNumbers = date.split("-");

        System.out.printf("%s/%s/%s", dateNumbers[1], dateNumbers[2], dateNumbers[0]);
    }
}