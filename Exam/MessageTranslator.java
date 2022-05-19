package SoftUni.Fundamentals.Exam;

import com.sun.jdi.Value;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MessageTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStr = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("([!])(?<command>[A-Z][a-z]{2,})(\\1)[:](?<string>[\\[][A-Za-z]{8,}[\\]])");
        for (int i = 0; i < numStr; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String str = matcher.group("string");
                str=str.trim();
                String command = matcher.group("command");
                char[] characters = str.toCharArray();
                String digits = "";
                System.out.printf("%s: ", command);
                for (int j = 1; j < characters.length-1; j++) {
                    int symbol = characters[j];
                    digits += symbol;
                    digits+=" ";
                }
                digits=digits.trim();
                System.out.printf("%s\n",digits);
            } else {
                System.out.println("The message is invalid");
            }
        }
    }
}
