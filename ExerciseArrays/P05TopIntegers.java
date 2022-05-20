package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int[] array = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <array.length ; i++) {
            int currentNum = array[i];
            boolean isBiggest = false;
            if (i==array.length-1){
                System.out.printf("%d ",array[i]);
            }
            for (int j = i+1; j <=array.length-1 ; j++) {
                if (currentNum>array[j]){
                    isBiggest=true;
                }else {
                    isBiggest=false;
                    break;
                }
            }
            if (isBiggest){
                System.out.printf("%d ",currentNum);
            }
        }
    }
}
