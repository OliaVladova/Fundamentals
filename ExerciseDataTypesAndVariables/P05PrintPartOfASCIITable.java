package SoftUni.Fundamentals.ExerciseDataTypesAndVariables;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class P05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <=stop; i++) {
            System.out.printf("%c ",i);

        }
    }
}
