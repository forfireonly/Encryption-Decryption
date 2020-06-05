import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        // write your code here
        Time noonInstance = new Time();
        noonInstance.hour = 12;
        noonInstance.minute = 0;
        noonInstance.second = 0;
        return noonInstance;

    }

    public static Time midnight() {
        // write your code here
        Time midnightInstance = new  Time();
        midnightInstance.hour = 0;
        midnightInstance.minute = 0;
        midnightInstance.second = 0;
        return midnightInstance;
    }

    public static Time ofSeconds(long seconds) {
        // write your code here
        Time ofSecondsInstance = new Time();
        int tmp = (int) (seconds / 3600);
        //int hour = tmp > 23 ? (tmp % 24) : tmp;
       // int minutes = (int) ((seconds % 3600) / 60);
        ofSecondsInstance.hour = tmp > 23 ? tmp % 24 : tmp;
        ofSecondsInstance.minute = (int) (seconds % 3600) / 60;
        ofSecondsInstance.second = (int) seconds % 60;
        return ofSecondsInstance;
    }

    public static Time of(int hour, int minute, int second) {
        // write your code here
        Time ofInstance = new Time();
        if (hour > 23 || minute > 59  || second > 59 || hour < 0 || minute < 0 || second < 0) {
            ofInstance = null;
        } else {
            ofInstance.hour = hour;
            ofInstance.minute = minute;
            ofInstance.second = second;
        }
        return ofInstance;

    }
}

/* Do not change code below */
public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time == null) {
            System.out.println(time);
        } else {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        }
    }
}