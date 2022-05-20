package SoftUni.Fundamentals.MapsLambdaAndStreamAPIExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberCom = Integer.parseInt(scanner.nextLine());

        Map<String, String> register = new LinkedHashMap<>();
        for (int i = 0; i < numberCom; i++) {
            List<String> user = Arrays
                    .stream(scanner.nextLine().split(" "))
                    .collect(Collectors.toList());
            if (user.get(0).equals("register")) {
                String username = user.get(1);
                String licensePlateNumber = user.get(2);

                if (!register.containsKey(username)) {
                    register.put(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully\n", username, licensePlateNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s\n", licensePlateNumber);
                }
            } else if (user.get(0).equals("unregister")) {
                String username = user.get(1);
                if (!register.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found\n", username);
                } else {
                    System.out.printf("%s unregistered successfully\n", username);
                    register.remove(username);
                }
            }

        }
        for (Map.Entry<String, String> entry : register.entrySet()) {
            System.out.printf("%s => %s\n",entry.getKey(),entry.getValue());
        }

    }
}
