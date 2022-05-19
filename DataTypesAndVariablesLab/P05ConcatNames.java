package SoftUni.Fundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class P05ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        String delimiter = scanner.nextLine();
        String fullName = firstName+delimiter+lastName;

        System.out.printf("%s",fullName);
    }
}
