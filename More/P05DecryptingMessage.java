package SoftUni.Fundamentals.More;

import java.util.Scanner;

public class P05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());
        StringBuilder message = new StringBuilder();
        for (int i = 0; i <lines ; i++) {
            char symbolInput = scanner.nextLine().charAt(0);
            char symbol = (char) (symbolInput + num);
            message.append(symbol);
        }
        System.out.println(message);
    }
}
