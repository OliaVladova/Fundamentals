package SoftUni.Fundamentals.ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = start; i <=finish ; i++) {
            System.out.printf("%d ",i);
            sum+=i;

        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
