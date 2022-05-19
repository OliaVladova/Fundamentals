package SoftUni.Fundamentals.ExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String startDestinations = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Travel")) {
            String[] command = input.split(":");
            switch (command[0]) {
                case "Add Stop":
                    int index = Integer.parseInt(command[1]);
                    String str = command[2];
                    if (isValidIndex(index, startDestinations)) {
                        String firstPart = startDestinations.substring(0, index);
                        String lastPart = startDestinations.substring(index);
                        startDestinations = firstPart + str + lastPart;
                        System.out.println(startDestinations);
                    }
                    break;
                case "Remove Stop":
                    int indexStart = Integer.parseInt(command[1]);
                    int indexEnd = Integer.parseInt(command[2]);
                    if (isValidIndex(indexStart, startDestinations) && isValidIndex(indexEnd, startDestinations)) {
                        String toBeReplaced = startDestinations.substring(indexStart, indexEnd+1);
                        startDestinations = startDestinations.replace(toBeReplaced, "");
                    }
                    System.out.println(startDestinations);
                    break;
                case "Switch":
                    String oldStr = command[1];
                    String newStr = command[2];
                    if(startDestinations.contains(oldStr)){
                        startDestinations=startDestinations.replaceAll(oldStr,newStr);
                    }
                    System.out.println(startDestinations);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s",startDestinations);
    }

    public static boolean isValidIndex(int index, String str) {

        return index >= 0 && index < str.length();
    }

}
