package SoftUni.Fundamentals.Exam;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        try {
            //get IP of the host
            InetAddress ia = InetAddress.getLocalHost();
            String str = ia.getHostAddress();
            System.out.println("Local host: " + str);

            URL url = new URL("https://ipinfo.io/?fbclid=IwAR1EE8nmIAAtmvt-drHiMO8BkwtzCEQaP6l9o_RbmoRm43VvrYFxu5hJj98");

            Scanner sc = new Scanner(url.openStream());

            List<String> locationInfo = new ArrayList<>();
            for (int i = 0; i <= 6; i++) {
                locationInfo.add(sc.nextLine());
            }

            String city = locationInfo.get(3);
            String country = locationInfo.get(5);
            System.out.println(city.replaceAll("\"", "").replaceAll(",", "").trim());
            System.out.println(country.replaceAll("\"", "").replaceAll(",", "").trim());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
