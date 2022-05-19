package SoftUni.Fundamentals.ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        Pattern pattern = Pattern.compile("([=|\\/])(?<place>[A-Z][A-Za-z]{2,})(\\1)");
        Matcher matcher = pattern.matcher(destination);
        int travelPoints = 0;
        List<String> places = new ArrayList<>();
        while (matcher.find()){
            String place = matcher.group("place");
            places.add(place);
        }

        for (String place:places) {
            int placeSize = place.length();
            travelPoints+=placeSize;

        }
        System.out.printf("Destinations: %s\n",String.join(", ",places));
        System.out.printf("Travel Points: %d",travelPoints);
    }
}
