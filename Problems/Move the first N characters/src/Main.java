import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] inputArray = input.split(" ");
        int number = Integer.parseInt(inputArray[1]);
        String newString = inputArray[0];
        if (number > newString.length()) {
            System.out.println(newString);
        } else {
            System.out.println(newString.substring(number) + newString.substring(0, number));
        }
       /*if (newString.length() < number) {
           System.out.println(newString);
       } else {
           String[] word = inputArray[0].split("");
           // int number = Integer.parseInt(inputArray[1]);
           StringBuilder changedString1 = new StringBuilder();
          // StringBuilder changedString2 = new StringBuilder();
           for (int i = 0; i < number; i++) {
               changedString1.append(word[i]);
           }
           for (int i = number; i < inputArray.length; i++) {
               changedString1.append(word[i]);
           }


        System.out.println(changedString1);
       }*/
    }
}