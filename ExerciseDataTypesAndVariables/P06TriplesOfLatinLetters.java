package SoftUni.Fundamentals.ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int j = 0; j < number; j++) {
            for (int k = 0; k <number; k++) {
                for (int l = 0; l <number; l++) {

                    char first = (char)('a'+j);
                    char second = (char)('a'+k);
                    char third = (char)('a'+l);
                    System.out.printf("%c%c%c\n",first,second,third);

                }
            }

        }
    }
}
