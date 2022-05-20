package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[lines];
        int[] secondArray = new int[lines];

        for (int i = 0; i <lines ; i++) {
            String input = scanner.nextLine();
            int[] inputArray = Arrays
                    .stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (i%2==0){
                firstArray[i]=inputArray[0];
                secondArray[i]=inputArray[1];
            }else {
                firstArray[i]=inputArray[1];
                secondArray[i]=inputArray[0];
            }

        }
        for (int element:firstArray) {
            System.out.print(element+" ");
        }
        System.out.println();
        for (int elementSecond:secondArray) {
            System.out.print(elementSecond+" ");
        }


    }
}
