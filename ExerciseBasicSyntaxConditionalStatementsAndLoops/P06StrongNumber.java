package SoftUni.Fundamentals.ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int startNum = number;

        while (number!=0){
            int digit = number%10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum+=fact;
            number=number/10;
        }

        if (sum==startNum){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
