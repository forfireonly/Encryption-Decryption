import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String theString = reader.readLine();
        int stringLength = theString.length();
        int middleOfString = stringLength / 2;
        StringBuilder withoutMiddleString = new StringBuilder();
        if (stringLength % 2 == 0) {
            withoutMiddleString.append(theString, 0, middleOfString - 1)
                    .append(theString, middleOfString + 1, stringLength);

        } else {
            withoutMiddleString.append(theString, 0, middleOfString)
                    .append(theString, middleOfString + 1, stringLength);

        }
        System.out.println(withoutMiddleString);
    }
}