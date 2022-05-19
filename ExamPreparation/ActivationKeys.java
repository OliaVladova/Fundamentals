package SoftUni.Fundamentals.ExamPreparation;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rawKey = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] commandInput = input.split(">>>");
            switch (commandInput[0]) {
                case "Contains":
                    String subStr = commandInput[1];
                    if (rawKey.contains(subStr)) {
                        System.out.printf("%s contains %s\n", rawKey, subStr);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String kind = commandInput[1];
                    int start = Integer.parseInt(commandInput[2]);
                    int end = Integer.parseInt(commandInput[3]);
                    if (kind.equals("Upper")) {
                        rawKey = toUpper(rawKey, start, end);
                    } else if (kind.equals("Lower")) {
                        rawKey = toLower(rawKey, start, end);
                    }
                    System.out.println(rawKey);
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(commandInput[1]);
                    int endIndex = Integer.parseInt(commandInput[2]);
                   rawKey=delete(rawKey,startIndex,endIndex);
                    System.out.println(rawKey);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s",rawKey);
    }

    public static String toUpper(String str, int start, int end) {

            String toReplace = str.substring(start,end);
            str=str.replace(toReplace,toReplace.toUpperCase());

        return str;
    }

    public static String toLower(String str, int start, int end) {
        String toReplace = str.substring(start,end);
        str=str.replace(toReplace,toReplace.toLowerCase());
        return str;
    }

    public static String delete(String str, int start, int end) {
        String toReplace = str.substring(start,end);
        str=str.replace(toReplace,"");
        return str;
    }
}
