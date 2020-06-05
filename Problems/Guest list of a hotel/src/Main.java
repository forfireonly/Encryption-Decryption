import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        StringBuilder names = new StringBuilder();
        while (scn.hasNext()) {
          names.append(scn.next()).append(" ");
        }
        String[] namesArray = names.toString().split(" ");
        for (int i = namesArray.length - 1; i >= 0; i--) {
            System.out.println(namesArray[i]);
        }

    }
}