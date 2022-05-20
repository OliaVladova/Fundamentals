package SoftUni.Fundamentals.Methods;

import java.util.Scanner;

public class P03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=number ; i++) {
            firstPrint(1,i);

        }
        for (int i =number-1; i >=1 ; i--) {
            firstPrint(1,i);
        }
    }

    public static void firstPrint(int start,int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
