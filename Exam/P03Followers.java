package SoftUni.Fundamentals.Exam;

import java.util.*;

public class P03Followers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<Integer>> followers = new TreeMap<>();
        while (!input.equals("Log out")) {
            String[] command = input.split(": ");
            String firstCom = command[0];
            String userName = command[1];

            switch (firstCom) {
                case "New follower":
                    if (!followers.containsKey(userName)) {
                        List<Integer> info = new ArrayList<>();
                        info.add(0);
                        info.add(0);
                        followers.put(userName, info);
                    }
                    break;
                case "Like":
                    int count = Integer.parseInt(command[2]);
                    if (followers.containsKey(userName)) {
                        followers.get(userName).set(0, followers.get(userName).get(0) + count);
                        followers.get(userName).set(1, followers.get(userName).get(1));
                    } else {
                        List<Integer> info = new ArrayList<>();
                        info.add(count);
                        info.add(0);
                        followers.put(userName, info);
                    }
                    break;
                case "Comment":
                    if (followers.containsKey(userName)) {
                        followers.get(userName).set(0, followers.get(userName).get(0));
                        followers.get(userName).set(1, followers.get(userName).get(1) + 1);
                    } else {
                        List<Integer> info = new ArrayList<>();
                        info.add(0);
                        info.add(1);
                        followers.put(userName, info);
                    }
                    break;
                case "Blocked":
                    if (followers.containsKey(userName)) {
                        followers.remove(userName);
                    } else {
                        System.out.printf("%s doesn't exist.\n", userName);
                    }
                    break;
            }

            int count = followers.size();
            System.out.printf("%d followers\n", count);
            followers.entrySet().stream().sorted((e1, e2) -> e2.getValue().get(0) + e2.getValue().get(1).compareTo(e1.getValue().get(0) + e1.getValue().get(1))).forEach((entry -> {
                System.out.printf("%s: %d\n", entry.getKey(), entry.getValue().get(0) + entry.getValue().get(1));
            }));
        }
    }
}
