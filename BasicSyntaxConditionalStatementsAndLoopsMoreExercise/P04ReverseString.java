package SoftUni.Fundamentals.BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class P04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        for (int i = command.length()-1; i >=0 ; i--) {
            char letter = command.charAt(i);
            System.out.printf("%c",letter);
        }
    }
}
