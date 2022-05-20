package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] arrayInput = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isFound = false;
        for (int index = 0; index < arrayInput.length; index++) {
            int current = arrayInput[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 0; i < index; i++) {
                leftSum += arrayInput[i];
            }
            for (int j = index+1; j <= arrayInput.length - 1; j++) {
                rightSum += arrayInput[j];
            }
            if (leftSum == rightSum) {
                System.out.println(index);
                isFound = true;
                break;
            }
        }
        if (!isFound){
            System.out.println("no");
        }
    }
}
