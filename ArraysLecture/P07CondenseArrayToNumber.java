package SoftUni.Fundamentals.ArraysLecture;

import java.util.Arrays;
import java.util.Scanner;

public class P07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayInput = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] condensedArray = new int[arrayInput.length-1];
        for (int i = 0; i < arrayInput.length ; i++) {
            if (arrayInput.length==1){
                break;
            }
            if (i==arrayInput.length-1){
                int[] condensedArrNew = new int[condensedArray.length - 1];
                i = -1;
                arrayInput = condensedArray;
                condensedArray = condensedArrNew;
            }else {
                condensedArray[i] = arrayInput[i] + arrayInput[i + 1];
            }
        }
        System.out.println(arrayInput[0]);

    }
}
