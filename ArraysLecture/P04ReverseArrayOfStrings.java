package SoftUni.Fundamentals.ArraysLecture;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        for (int i = 0; i < array.length / 2; i++) {
            String first = array[i];

            array[i]=array[array.length-1-i];
            array[array.length-1-i]=first;

        }
        System.out.println(String.join(" ",array));
    }
}
