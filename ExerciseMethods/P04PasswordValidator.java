package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isValidLength = validatingLength(input);
        boolean isValidConsistence = validatingConsists(input);
        if (!isValidConsistence){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isValidDigits = validatingDigits(input);
        if (isValidConsistence&&isValidDigits&&isValidLength){
            System.out.println("Password is valid");
        }
    }

    public static boolean validatingLength(String password) {
        boolean isValidLength = false;
        if (password.length() >= 6 && password.length() <= 10) {
            isValidLength = true;
        } else {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return isValidLength;
    }

    public static boolean validatingConsists(String password) {

        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    public static boolean validatingDigits(String password) {
        boolean isValidDigits = false;
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                count++;
            }
            if (count >= 2) {
                isValidDigits = true;
                break;
            }
        }
        if (!isValidDigits) {
            System.out.println("Password must have at least 2 digits");
        }
        return isValidDigits;
    }
}
