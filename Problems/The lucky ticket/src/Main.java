import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int counter = 0;
        int firstThree = 0;
        int secondThree = 0;
        String ticket = scn.nextLine();
        String[] ticketStringArray = ticket.split("");
        while (counter < 3) {
            firstThree += Integer.parseInt(ticketStringArray[counter]);
            counter++;
        }
        while (counter > 2 && counter < 6) {
            secondThree += Integer.parseInt(ticketStringArray[counter]);
            counter++;
        }
        if (firstThree == secondThree) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}