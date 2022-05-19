package SoftUni.Fundamentals.DataTypesAndVariablesLab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <=number ; i++) {
            int newNum = i;
            int sum = 0;
            while (newNum!=0){
                int lastNum = newNum%10;
                newNum/=10;
                sum+=lastNum;
            }
            if (sum==5||sum==7||sum==11){
                System.out.printf("%d -> True\n",i);;
            }else {
                System.out.printf("%d -> False\n",i);
            }
        }

    }
}
