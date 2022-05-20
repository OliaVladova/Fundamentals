package SoftUni.Fundamentals.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int numberTwo = Integer.parseInt(scanner.nextLine());

        double calculatedResult=calculate(numberOne,operation,numberTwo);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(calculatedResult));

    }
    public static double calculate(int firstNum, String command, int secondNum){
        double result=0;
        switch (command){
            case "+":
                result=firstNum+secondNum;
                break;
            case "-":
                result=firstNum-secondNum;
                break;
            case "*":
                result=firstNum*secondNum;
                break;
            case "/":
                result=firstNum*1.0/secondNum;
                break;
        }
        return result;
    }
}
