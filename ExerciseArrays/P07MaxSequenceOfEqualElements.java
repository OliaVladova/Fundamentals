package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] inputArray = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int length = 1;
        int maxLength = 0;
        int position = 0;
        int bestPosition = 0;
        for (int i = 1; i < inputArray.length ; i++) {

            if (inputArray[i]==inputArray[i-1]){
                length+=1;
            }else {
                length=1;
                position=i;
            }
            if (length>maxLength){
                maxLength=length;
                bestPosition=position;
            }
        }
        for (int start = bestPosition;start<bestPosition+maxLength;start++){
            System.out.print(inputArray[start] + " ");
        }
    }
}
