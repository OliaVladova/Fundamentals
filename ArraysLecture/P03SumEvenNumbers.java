package SoftUni.Fundamentals.ArraysLecture;

import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] array= Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int sum = 0;
        for (int j = 0; j < array.length ; j++) {

            if (array[j]%2==0){
                sum+=array[j];
            }
        }
        System.out.println(sum);
    }
}
