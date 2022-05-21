package SoftUni.Fundamentals.More;

import java.util.Scanner;

public class P01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input = scanner.nextLine();
        switch (type) {
            case "int":
                int resultInt = typeInt(input);
                System.out.println(resultInt);
                break;
            case "real":
                double resultDouble = typeDouble(input);
                System.out.printf("%.2f",resultDouble);
                break;
            case "string":
                String resultStr = typeString(input);
                System.out.println(resultStr);
                break;
        }
    }

    public static int typeInt(String string) {
        int num = Integer.parseInt(string);
        return 2 * num;
    }
    public static double typeDouble(String string) {
        double num = Double.parseDouble(string);
        return 1.5 * num;
    }
    public static String  typeString(String string) {
        String newStr  = "$" + string + "$";
        return newStr;
    }
}
