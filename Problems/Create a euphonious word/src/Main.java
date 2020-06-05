import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        String[] vowels = {"a", "e", "i", "o", "u", "y"};
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        String[] wordArray = word.split("");
        int counterLetters = 0;
        int counterV = 0;
        int counterC = 0;

        for (String s : wordArray) {
            if (Arrays.asList(vowels).contains(s)) {
                counterV++;
                counterC = 0;
            } else {
                counterC++;
                counterV = 0;
            }
            if (counterV == 3) {
                counterLetters++;
                counterV = 1;
            }
            if (counterC == 3) {
                counterLetters++;
                counterC = 1;
            }

        }
        System.out.println(counterLetters);

}
}