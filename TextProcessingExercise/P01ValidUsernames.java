package SoftUni.Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] username = scanner.nextLine().split(", ");

        for (int i = 0; i < username.length; i++) {
            String userN = username[i];
            if (userN.length() >= 3 && userN.length() <= 16) {
                boolean isCorrect = true;
                for (int j = 0; j < userN.length(); j++) {
                    char symbol = userN.charAt(j);
                    if (!Character.isLetterOrDigit(symbol) && symbol != 45 && symbol != 95) {
                        isCorrect=false;
                        break;
                    }
                }
                if (isCorrect){
                    System.out.println(userN);
                }

            }
        }
    }
}
