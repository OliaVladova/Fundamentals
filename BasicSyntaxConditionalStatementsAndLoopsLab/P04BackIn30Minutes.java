package SoftUni.Fundamentals.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class P04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int newMin = minutes+30;
        int newHour = hour;
        if (newMin>59){
            newHour++;
            newMin=newMin-60;
        }
        if (newHour==24){
            newHour=0;
        }
        if (newMin<10) {
            System.out.printf("%d:0%d", newHour, newMin);
        }else {
            System.out.printf("%d:%d", newHour, newMin);
        }
    }
}
