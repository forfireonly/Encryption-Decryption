import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int maxDivFour = 0;
        Scanner scn = new Scanner(System.in);
        int numberOfElements = Integer.parseInt(scn.next());
        while (numberOfElements > 0) {
            int number = scn.nextInt();
            if (number % 4 == 0 && number > maxDivFour) {
                maxDivFour = number;
            }
            numberOfElements--;
        }
        System.out.println(maxDivFour);
    }
}