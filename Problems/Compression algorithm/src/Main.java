import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scn = new Scanner(System.in);
        String notCompressed = scn.nextLine();
        int counter = 0;
        String[] notCompressedArray = notCompressed.split("");
        StringBuilder compressed = new StringBuilder();
        String element = notCompressedArray[0];

        int arrayLength = notCompressedArray.length;
        int lengthTracker = 1;
        for (String each : notCompressedArray) {
            if (element.equals(each)) {
                counter++;
                if (lengthTracker == arrayLength) {
                    compressed.append(element).append(counter);
                }

            } else {
                compressed.append(element).append(counter);
                element = each;
                counter = 1;
                if (lengthTracker == arrayLength) {
                    compressed.append(element).append(counter);
                }
            }
            lengthTracker++;
        }
        System.out.println(compressed);
    }
}