package SoftUni.Fundamentals.DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P6BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int countOpen = 0;
        int countClosed = 0;

        for (int i = 1; i <=lines ; i++) {
            String letter = scanner.nextLine();
            if (letter.equals("(")){
                countOpen++;
            }else if (letter.equals(")")&&countOpen==1){
                countClosed++;

            }
            if (countClosed==1&&countOpen==1){
                countOpen=0;
                countClosed=0;
            }
        }
        if (countClosed!=countOpen){
            System.out.println("UNBALANCED");
        }else {
            System.out.println("BALANCED");
        }
    }
}
