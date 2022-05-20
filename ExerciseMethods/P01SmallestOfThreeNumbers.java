package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSmallestNum(firstNum,secondNum,thirdNum);
    }

    public static void printSmallestNum(int numOne, int numTwo, int numThree){
        int minNum = Integer.MAX_VALUE;
        if (numOne<minNum){
            minNum=numOne;
        }
        if (numTwo<minNum){
            minNum=numTwo;
        }
        if (numThree<minNum){
            minNum=numThree;
        }
        System.out.println(minNum);
    }
}
