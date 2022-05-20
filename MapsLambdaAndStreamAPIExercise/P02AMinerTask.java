package SoftUni.Fundamentals.MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = 0;

        LinkedHashMap<String, Integer> miner = new LinkedHashMap<>();
        List<String> resource = new ArrayList<>();
        List<Integer> quantity = new ArrayList<>();
        while (!input.equals("stop")) {
            String command = input;
            count++;
            if (count % 2 != 0) {
                resource.add(command);
            } else {
                int amount = Integer.parseInt(command);
                quantity.add(amount);
            }

            input = scanner.nextLine();
        }
        for (String resourceStart : resource) {
            for (int i=0;i< quantity.size();i++) {
                if (!miner.containsKey(resourceStart)) {
                    miner.put(resourceStart, quantity.get(i));
                }else {
                    miner.put(resourceStart,miner.get(resourceStart)+ quantity.get(i));
                }
                quantity.remove(i);
                break;
            }
        }
        for (Map.Entry<String, Integer>entry: miner.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(),entry.getValue());
        }
    }
}
