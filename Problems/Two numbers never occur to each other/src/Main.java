import java.util.Scanner;
class Main {
    public static void main(String[] args)  {
        // put your code here
        Scanner scn = new Scanner(System.in);
        int sizeOfArray = scn.nextInt();
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = scn.nextInt();
        }
        int firstNumber = scn.nextInt();
        int secondNumber = scn.nextInt();
        boolean isNotNextToEachOther = true;
        for (int i = 0; i < sizeOfArray - 1; i++) {
            if (array[i] == firstNumber && array[i + 1] == secondNumber) {
                isNotNextToEachOther = false;
            }
            if (array[i] == secondNumber && array[i + 1] == firstNumber) {
                isNotNextToEachOther = false;
            }
        }
        System.out.println(isNotNextToEachOther);
    }
}