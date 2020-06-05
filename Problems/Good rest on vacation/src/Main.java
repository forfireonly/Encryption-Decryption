import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int days = scanner.nextInt();
        int food = scanner.nextInt();
        int flight = scanner.nextInt();
        int nights = scanner.nextInt();
        System.out.println(food * days + flight * 2 + (days - 1) * nights);
    }
}