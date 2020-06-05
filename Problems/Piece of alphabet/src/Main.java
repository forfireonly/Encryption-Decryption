import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner scn = new Scanner(System.in);
        String possibleSubstring = scn.nextLine();
        System.out.println(alphabet.contains(possibleSubstring));
        }
    }
