package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firsNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        long firstFact = calculateFact(firsNum);
        long secondFact = calculateFact(secondNum);
        double division = firstFact*1.0/secondFact;
        System.out.printf("%.2f",division);
    }
    public static long calculateFact (int num){
        long fact = 1;
        for (int i = 1; i <=num ; i++) {
            fact*=i;
        }
        return fact;
    }

}
