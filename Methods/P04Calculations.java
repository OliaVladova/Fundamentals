package SoftUni.Fundamentals.Methods;

import java.util.Scanner;

public class P04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        switch (command) {
            case "add":
                addPrint(firstNum, secondNum);
                break;
            case "multiply":
                multiplyPrint(firstNum, secondNum);
                break;
            case "subtract":
                subtractPrint(firstNum, secondNum);
                break;
            case "divide":
                dividePrint(firstNum,secondNum);
                break;
        }
    }

    public static void addPrint(int numOne, int numTwo) {
        int sum = numOne + numTwo;
        System.out.println(sum);
    }

    public static void multiplyPrint(int numOne, int numTwo) {
        int result = numOne * numTwo;
        System.out.println(result);
    }

    public static void subtractPrint(int numOne, int numTwo) {
        int result = numOne - numTwo;
        System.out.println(result);
    }

    public static void dividePrint(int numOne, int numTwo) {
        int result = numOne / numTwo;
        System.out.println(result);
    }
}
