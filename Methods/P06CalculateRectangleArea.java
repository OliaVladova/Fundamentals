package SoftUni.Fundamentals.Methods;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = Integer.parseInt(scanner.nextLine());
        int sideB = Integer.parseInt(scanner.nextLine());

         int area=rectangleAreaCalculation(sideA,sideB);

        System.out.println(area);
    }

    public static int rectangleAreaCalculation(int firstSide, int secondSide){
        int areaResult = firstSide*secondSide;
        return areaResult;
    }
}
