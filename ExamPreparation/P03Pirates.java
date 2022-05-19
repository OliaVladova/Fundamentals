package SoftUni.Fundamentals.ExamPreparation;

import java.util.*;

public class P03Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String commandInput = scanner.nextLine();
        Map<String, List<Integer>> targets = new TreeMap<>();
        while (!commandInput.equals("Sail")) {
            String[] command = commandInput.split("\\|\\|");
            int population = Integer.parseInt(command[1]);
            int gold = Integer.parseInt(command[2]);
            if (!targets.containsKey(command[0])){
            List<Integer> cityInfo = new ArrayList<>();
            cityInfo.add(population);
            cityInfo.add(gold);
            targets.put(command[0],cityInfo);
            }else {
                List<Integer> cityInfo = new ArrayList<>();
                cityInfo.add(targets.get(command[0]).get(0)+population);
                cityInfo.add(targets.get(command[0]).get(1)+gold);
                targets.put(command[0],cityInfo);
            }

            commandInput = scanner.nextLine();
        }
        String eventsInput = scanner.nextLine();
        while (!eventsInput.equals("End")){
            String[] events = eventsInput.split("=>");
            String town = events[1];
            switch (events[0]){
                case "Plunder":
                    int people = Integer.parseInt(events[2]);
                    int gold = Integer.parseInt(events[3]);
                    if (targets.containsKey(town)){
                        List<Integer> cityInfo = new ArrayList<>();
                        cityInfo.add(targets.get(town).get(0)-people);
                        cityInfo.add(targets.get(town).get(1)-gold);
                        targets.put(town,cityInfo);
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.\n",town,gold,people);
                    }
                    if (targets.get(town).get(0)==0||targets.get(town).get(1)==0){
                        System.out.printf("%s has been wiped off the map!\n",town);
                        targets.remove(town);
                    }

                    break;
                case "Prosper":
                    int goldIncreased = Integer.parseInt(events[2]);
                    if (goldIncreased<0){
                        System.out.println("Gold added cannot be a negative number!");
                    }else {
                        int increasing = targets.get(town).get(1)+goldIncreased;
                        List<Integer> cityInfo = new ArrayList<>();
                        cityInfo.add(targets.get(town).get(0));
                        cityInfo.add(increasing);
                        targets.put(town,cityInfo);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.\n",goldIncreased,town,increasing);
                    }
                    break;
            }
            eventsInput = scanner.nextLine();
        }
        int size = targets.size();
        System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:\n", size);
        if (size>0) {
            targets.entrySet().stream().sorted((e1, e2) -> e2.getValue().get(1).compareTo(e1.getValue().get(1))).forEach((entry -> {

                System.out.printf(" %s -> Population: %d citizens, Gold: %d kg\n",entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));

            }));
        }else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
