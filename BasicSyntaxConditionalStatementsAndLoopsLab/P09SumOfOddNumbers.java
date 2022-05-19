package SoftUni.Fundamentals.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <=2*number ; i++) {
            if (i%2!=0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.printf("Sum: %d",sum);
    }
}
