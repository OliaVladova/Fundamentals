package SoftUni.Fundamentals.ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int addedLitres = 0;

        for (int i = 0; i <n ; i++) {
            int litres = Integer.parseInt(scanner.nextLine());
            addedLitres+=litres;
            if (addedLitres>255){
                System.out.println("Insufficient capacity!");
                addedLitres-=litres;
            }

        }
        System.out.printf("%d",addedLitres);
    }
}
