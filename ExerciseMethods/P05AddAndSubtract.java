package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        int numThree = Integer.parseInt(scanner.nextLine());

        int sum = addNumbers(numOne,numTwo);
        int sub = subtract(sum,numThree);
        System.out.println(sub);
    }
    public static int addNumbers(int firstNum, int secondNum){
        int sum = firstNum+secondNum;
        return sum;
    }
    public static int subtract(int number,int thirdNumber){
        int subs = number-thirdNumber;
        return subs;
    }
}
