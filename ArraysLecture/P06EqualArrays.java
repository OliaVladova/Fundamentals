package SoftUni.Fundamentals.ArraysLecture;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        int[] firstArray = Arrays
                .stream(firstInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondArray = Arrays
                .stream(secondInput.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxLength = 0;
        int sum = 0;
        boolean areTheSame = false;
        if (secondArray.length > firstArray.length) {
            maxLength = secondArray.length;
        } else {
            maxLength = firstArray.length;
        }
        for (int i = 0; i < maxLength; i++) {
            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areTheSame=false;
                break;
            } else {
                areTheSame = true;
                sum+=firstArray[i];

            }
        }
        if (areTheSame){
            System.out.print("Arrays are identical. Sum: "+sum);
        }
    }
}
