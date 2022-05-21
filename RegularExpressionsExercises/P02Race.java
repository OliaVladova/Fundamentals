package SoftUni.Fundamentals.RegularExpressionsExercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> players = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> mapOfPlayers = new LinkedHashMap<>();
        players.forEach(player -> mapOfPlayers.put(player, 0));
        String input = scanner.nextLine();
        Pattern patternName = Pattern.compile("[A-Za-z]+");
        Pattern patternDigit = Pattern.compile("[0-9]");
        while (!input.equals("end of race")) {
            StringBuilder name = new StringBuilder();
            Matcher matcher = patternName.matcher(input);
            while (matcher.find()) {
                name.append(matcher.group());
            }
            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }
            String racerName = name.toString();
            if (mapOfPlayers.containsKey(racerName)) {
                int currentDistance = mapOfPlayers.get(racerName);
                mapOfPlayers.put(racerName, currentDistance + distance);
            }
            input = scanner.nextLine();
        }
        List<String> firstPlayers = mapOfPlayers.entrySet().stream()
                .sorted(Map.Entry .comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.printf("1st place: %s\n",firstPlayers.get(0));
        System.out.printf("2nd place: %s\n",firstPlayers.get(1));
        System.out.printf("3rd place: %s",firstPlayers.get(2));
    }
}
