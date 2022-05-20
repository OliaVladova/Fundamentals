package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfArray = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int[] array = new int[lengthOfArray];
        int maxSum = 0;
        String neededArr = "";
        int[] neededArray = new int[lengthOfArray];

        int length = 1;
        int maxLength = 0;
        int position = 0;
        int bestPosition = 0;
        boolean isBest = false;
        int counterForSamples =0;
        int actualCount =0;

        while (!command.equals("Clone them!")) {
            String inputArr = command;
            counterForSamples++;
            array = Arrays
                    .stream(command.split("!"))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int sum = 0;

            for (int i = 1; i < lengthOfArray; i++) {
                if (array[i] == 1 && array[i - 1] == 1) {
                    length += 1;
                }else {
                    length += 1;
                    position = i;
                }
                if (length > maxLength) {
                    maxLength = length;
                    bestPosition = position;
                    isBest=true;
                }

            }
                for (int k = 0; k < lengthOfArray; k++) {
                    sum += array[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (isBest&&sum == maxSum) {
                    neededArr = inputArr;
                    actualCount = counterForSamples;
                }



            command = scanner.nextLine();
        }
        neededArray=Arrays
                .stream(neededArr.split("!"))
                .mapToInt(Integer::parseInt)
                .toArray();
        System.out.printf("Best DNA sample %d with sum: %d.\n",actualCount,maxSum);
        for (int i = 0; i <lengthOfArray ; i++) {
            System.out.printf("%d ",neededArray[i]);
        }

    }
}
