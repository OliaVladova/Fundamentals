package SoftUni.Fundamentals.Methods;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int num1 = Integer.parseInt(scanner.nextLine());
                int num2 = Integer.parseInt(scanner.nextLine());
               int resultInt= getMax(num1,num2);
                System.out.println(resultInt);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char resultChar = getMax(firstChar,secondChar);
                System.out.println(resultChar);
                break;
            case "string":
                String firstString = scanner.nextLine();
                String secondString = scanner.nextLine();
                String resultString= getMax(firstString,secondString);
                System.out.println(resultString);
                break;
        }
    }

    public static int getMax(int first, int second) {
        if (first > second) {
           return first;
        } return second;

    }
    public static char getMax(char first, char second) {
        if (first > second) {
           return first;
        }
            return second;
    }
    public static String getMax(String first, String second) {
        if (first.compareTo(second)>=0) {
            return first;
        }
        return second;
    }
}
