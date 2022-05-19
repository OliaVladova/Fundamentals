package SoftUni.Fundamentals.ArraysLecture;

import java.util.Arrays;
import java.util.Scanner;

public class P05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] array = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

                int evenSum =0;
                int oddSum =0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%2==0){
                evenSum+=array[i];
            }else {
                oddSum+=array[i];
            }
        }
        System.out.printf("%d",evenSum-oddSum);
    }
}
