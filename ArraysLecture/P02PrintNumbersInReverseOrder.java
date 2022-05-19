package SoftUni.Fundamentals.ArraysLecture;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] arrNumbers = new int[num];
        for (int i = 0; i < num; i++) {
            int newNum = Integer.parseInt(scanner.nextLine());
             arrNumbers[i]=newNum;
        }
        for (int j = arrNumbers.length-1; j >=0 ; j--) {
            System.out.printf("%d ",arrNumbers[j]);
        }
    }
}
