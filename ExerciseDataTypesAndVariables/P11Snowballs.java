package SoftUni.Fundamentals.ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSnowballs = Integer.parseInt(scanner.nextLine());

        double highest = Double.MIN_VALUE;
        int highestSnowballSnow =0;
        int highestSnowballTime =0;
        int highestSnowballQuality =0;
        for (int i = 1; i <= numSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double snowballValue = Math.pow((snowballSnow *1.0/ snowballTime), snowballQuality);
            if (highest<snowballValue){
                highest=snowballValue;
                highestSnowballSnow=snowballSnow;
                highestSnowballTime=snowballTime;
                highestSnowballQuality=snowballQuality;
            }

        }
        System.out.printf("%d : %d = %.0f (%d)",highestSnowballSnow,highestSnowballTime,highest,highestSnowballQuality);
    }
}
