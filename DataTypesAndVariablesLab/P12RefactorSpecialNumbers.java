package SoftUni.Fundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= number; num++) {
           int actualNum = num;
           int sum = 0;
            while (num != 0) {
              int  lastDigit = num % 10;
              sum+=lastDigit;
                num = num / 10;
            }
            if (sum == 5|| sum == 7 || sum == 11){
                System.out.printf("%d -> %b%n", actualNum, num);
            }else {
                System.out.printf("%d -> False\n",num);
            }


        }

    }
}
