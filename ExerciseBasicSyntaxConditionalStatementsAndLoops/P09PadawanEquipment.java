package SoftUni.Fundamentals.ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabers = Double.parseDouble(scanner.nextLine());
        double robes = Double.parseDouble(scanner.nextLine());
        double belts = Double.parseDouble(scanner.nextLine());

        double moreLightsabers = Math.ceil(students * 1.1);
        int freeBelts = (students / 6);
        int actualBelts = students-freeBelts;

        double total = moreLightsabers*lightsabers+students*robes+actualBelts*belts;
        if (total<=amountMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",total);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",Math.abs(total-amountMoney));
        }

    }
}
