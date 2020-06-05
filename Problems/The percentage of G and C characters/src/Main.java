import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sequence = reader.readLine().toLowerCase();
        int count = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == 'c' || sequence.charAt(i) == 'g') {
                count++;
            }
        }
        System.out.println((double) count / sequence.length() * 100);
    }
}