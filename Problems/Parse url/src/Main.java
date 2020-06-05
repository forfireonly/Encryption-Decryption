import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        // put your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] twoPartsURL = url.split("\\?");
        String[] neededInformation = twoPartsURL[1].split("&");
        String password = "";
        for (String each : neededInformation) {
            String[] info = each.split("=");
            if (info.length == 1) {
                System.out.println(info[0] + " : " + "not found");
            } else {
                String data = (info[0]) + " : " + info[1];
                System.out.println(data);
            }
            if ("pass".equals(info[0])) {
                password = info[1];
            }
        }
        if (!password.isEmpty()) {
            System.out.println("password : " + password);
        }

    }
}