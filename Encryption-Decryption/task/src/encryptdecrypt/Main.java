package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

abstract class Process{

    void procesText(String inputFile, String outputFile, String data, int key) {
        String text = "";
        if (data.equals(""))  {
            data = readFile(inputFile);
        }
        text = procesText(data, key);
        if (!outputFile.equals("")) {
            writeFile(outputFile, text);
        } else {
            System.out.println(text);
        }
    }

    protected abstract String procesText(String data, int key);

    String readFile(String inputFile) {
        File file = new File(inputFile);
        StringBuilder data = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                data.append(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + inputFile);
        }
        return String.valueOf(data);
    }
    void writeFile(String outputFile, String text) {
        File file = new File(outputFile);
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(text);
        } catch (IOException e) {
            System.out.printf("An exception occurs %s", e.getMessage());
        }
    }
}
class ShiftingIncryption extends Process {

    @Override
    protected String procesText(String data, int key) {
        char[] dataCharArray = data.toCharArray();
        StringBuilder processedString = new StringBuilder();
        for (char each : dataCharArray) {
            if (Character.isUpperCase(each)) {
                int ch = each + key <= 90 ? each + key : each + key - 90 + 64;
                processedString.append((char) ch);
            } else if (Character.isLowerCase(each)) {
                int ch = each + key <= 122 ? each + key : each + key - 122 + 96;
                processedString.append((char) ch);
            } else {
                processedString.append(each);
            }
        }
        return String.valueOf(processedString);
    }
}
class ShiftingDecryption extends Process {

    @Override
    protected String procesText(String data, int key) {
        char[] dataCharArray = data.toCharArray();
        StringBuilder processedString = new StringBuilder();
        for (char each : dataCharArray) {
            if (Character.isUpperCase(each)) {
                int ch = each - key >= 65 ? each - key : 91 - (65 - (each - key ));
                processedString.append((char) ch);
                //processedString.append(String.valueOf(each - key - 64 + 90));
            } else if (Character.isLowerCase(each)) {
                int ch = each - key >= 97 ? each - key : 123 - (97 - (each - key));
                processedString.append((char) ch);
                //processedString.append(String.valueOf(each - key - 96 + 122));
            } else {
                processedString.append(each);
            }

        }
        return String.valueOf(processedString);
    }
}
class UnicodeIncryption extends Process {


    @Override
    protected String procesText(String data, int key) {
        char[] dataCharArray = data.toCharArray();
        StringBuilder processedString = new StringBuilder();
        for (char each : dataCharArray) {
            int intEach = each + key;
            processedString.append((char) intEach);
        }
        return String.valueOf(processedString);
    }
}
class UnicodeDecryption extends Process {


    @Override
    protected String procesText(String data, int key) {
        char[] dataCharArray = data.toCharArray();
        StringBuilder processedString = new StringBuilder();
        for (char each : dataCharArray) {
            int intEach = each - key;
            processedString.append((char) intEach);
        }
        return String.valueOf(processedString);
    }
}
public class Main {

    public static void main(String[] args) {

        int key = 0;
        String algorithm = "";
        String inputFile = "";
        String  outputFile = "";
        String data = "";
        String mode = "";

        for (int i = 0; i < args.length; i++) {
            if ("-key".equals(args[i])) {
                key = Integer.parseInt(args[i + 1]);
            }
            if ("-mode".equals(args[i])) {
                mode = args[i + 1];
            }
            if ("-out".equals(args[i])) {
                outputFile = args[i + 1];
            }
            if ("-in".equals(args[i])) {
                inputFile = args[i + 1];
            }
            if ("-alg".equals(args[i])) {
                algorithm = args[i + 1];
            }
            if ("-data".equals(args[i])) {
                data = args[i + 1];
            }
        }
        System.out.println(outputFile);
        if ("shift".equals(algorithm) && ("enc".equals(mode))) {
            Process processedText = new ShiftingIncryption();
            processedText.procesText(inputFile, outputFile, data, key);
        } else if ("shift".equals(algorithm) && ("dec".equals(mode))) {
            Process processedText = new ShiftingDecryption();
            processedText.procesText(inputFile, outputFile, data, key);
        } else if ("unicode".equals(algorithm) && ("enc".equals(mode))) {
            Process processedText = new UnicodeIncryption();
            processedText.procesText(inputFile, outputFile, data, key);
        } else if ("unicode".equals(algorithm) && ("dec".equals(mode))) {
            Process processedText = new UnicodeDecryption();
            processedText.procesText(inputFile, outputFile, data, key);
        }
    }
}
