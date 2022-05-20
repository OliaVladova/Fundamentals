package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printMatrix(number);
    }
    public static void printMatrix(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.printf("%d ",n);
            }
            System.out.println();
        }
    }
}
