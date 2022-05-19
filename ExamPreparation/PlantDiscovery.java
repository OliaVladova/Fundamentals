package SoftUni.Fundamentals.ExamPreparation;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantMap = new HashMap<>();
        Map<String, Double> plantRating = new HashMap<>();
        for (int i = 0; i < number; i++) {
            String[] plantInfo = scanner.nextLine().split("<->");
            String plantName = plantInfo[0];
            int rarity = Integer.parseInt(plantInfo[1]);
            plantMap.putIfAbsent(plantName, 0);
            plantRating.putIfAbsent(plantName, 0.0);
            plantMap.put(plantName, rarity);
        }
        String inputCom = scanner.nextLine();
        while (!inputCom.equals("Exhibition")) {
            String[] command = inputCom.split("[: -]+ ");


            if (!plantRating.containsKey(command[1])) {
                System.out.println("error");
            }else {
                switch (command[0]) {
                    case "Rate":
                        String plant = command[1];
                        double currRating = Double.parseDouble(command[2]);
                        if (plantRating.get(plant) == 0) {
                            plantRating.put(plant, currRating);
                        } else {
                            double newRating = (plantRating.get(plant) + currRating) / 2;
                            plantRating.put(plant, newRating);
                        }
                        break;
                    case "Update":
                        String plantUpdate = command[1];
                        int rateUpdate = Integer.parseInt(command[2]);
                        if (!plantMap.containsKey(plantUpdate)) {
                            plantMap.put(plantUpdate, rateUpdate);
                        } else {
                            plantMap.put(plantUpdate, rateUpdate);
                        }
                        break;
                    case "Reset":
                        String plantReset = command[1];
                        if (plantRating.containsKey(plantReset)) {
                            plantRating.put(plantReset, 0.0);
                        }
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
            }
            inputCom = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition: ");
        plantMap.entrySet().stream().sorted((p1, p2) -> {
            int result = p2.getValue() - p1.getValue();
            if (result == 0) {
                double res = (plantRating.get(p2.getKey()) - plantRating.get(p1.getKey()));
                return (int) res;
            }
            return result;
        }).forEach(entry -> {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", entry.getKey(), entry.getValue(), plantRating.get(entry.getKey()));
        });

    }
}
