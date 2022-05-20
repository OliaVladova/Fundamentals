package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rotations = Integer.parseInt(scanner.nextLine());
        int[] arrayInput = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i=1;i<=rotations;i++){
            int firstNumber = arrayInput[0];
            for (int index = 0; index <arrayInput.length-1 ; index++) {
                arrayInput[index]=arrayInput[index+1];
            }
            arrayInput[arrayInput.length-1]=firstNumber;

        }
        for (int i = 0; i <arrayInput.length ; i++) {
            System.out.printf("%d ",arrayInput[i]);
        }
    }
}
