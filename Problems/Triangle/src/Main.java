import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int firstSide = scn.nextInt();
        int secondSide = scn.nextInt();
        int thirdSide = scn.nextInt();

        System.out.println(firstSide + secondSide > thirdSide &&
                firstSide + thirdSide > secondSide &&
                secondSide + thirdSide > firstSide ? "YES" : "NO");


    }
}