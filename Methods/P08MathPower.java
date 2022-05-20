package SoftUni.Fundamentals.Methods;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        double result = calculatedPower(number,times);
        DecimalFormat resultNew = new DecimalFormat("0.####");
        System.out.println(resultNew.format(result));
    }

    public static double calculatedPower(double number, int times) {
        double result = 1;
        for (int i = 0; i < times; i++) {
            result*=number;
        }
        return result;
    }
}
