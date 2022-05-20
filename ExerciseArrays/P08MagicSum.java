package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());

        int[] array = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int used = 0;
        boolean sumTrue = false;

        for (int i =0;i<array.length-1;i++){
           int numFirst = array[i];
            for (int j = i+1; j <array.length ; j++) {
                int numSecond = array[j];
                if (numFirst+numSecond==number){
                    System.out.printf("%d %d\n",numFirst,numSecond);
            }
            }

        }
    }
}
