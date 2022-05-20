package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputOne = scanner.nextLine();
        String[] firstArray = inputOne.split(" ");
        String inputTwo = scanner.nextLine();
        String[] secondArray = inputTwo.split(" ");

        for (String elementInSecond:secondArray) {
            for (String elementInFirst:firstArray) {
                if (elementInSecond.equals(elementInFirst)){
                    System.out.print(elementInSecond+" ");
                }
            }
        }

    }
}
