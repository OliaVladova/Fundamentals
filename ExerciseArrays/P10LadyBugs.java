package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P10LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        String fullIndexes = scanner.nextLine();
        int[] arrayPosition = Arrays
                .stream(fullIndexes.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] ladyBugsArray = new int[fieldSize];
        for (int index:arrayPosition) {
            if (index>=0&&index<= ladyBugsArray.length-1){
                ladyBugsArray[index]=1;
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String movement = command;

            String[] movementArray = movement.split(" ");
            int startPosition = Integer.parseInt(movementArray[0]);
            String direction = movementArray[1];
            int newPosition = Integer.parseInt(movementArray[2]);

            if (startPosition >= 0 && startPosition <= ladyBugsArray.length - 1 && ladyBugsArray[startPosition] == 1) {
                ladyBugsArray[startPosition] = 0;

                if (direction.equals("right")) {
                    startPosition += newPosition;
                    while (startPosition <= ladyBugsArray.length - 1 && ladyBugsArray[startPosition] == 1) {
                        startPosition += newPosition;
                    }if (startPosition <= ladyBugsArray.length - 1) {
                        ladyBugsArray[startPosition] = 1;
                    }
                } else if (direction.equals("left")) {
                    startPosition-=newPosition;
                    while (startPosition >= 0 && ladyBugsArray[startPosition] == 1) {
                        startPosition -= newPosition;
                    }
                    if (startPosition >= 0) {
                        ladyBugsArray[startPosition] = 1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int number:ladyBugsArray) {
            System.out.print(number + " ");
        }
    }
}
