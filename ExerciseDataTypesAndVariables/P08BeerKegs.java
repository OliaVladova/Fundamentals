package SoftUni.Fundamentals.ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";

        for (int i = 0; i <number ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI*radius*radius*height;


            if (volume>maxVolume){
                maxModel = model;
                maxVolume = volume;
            }

        }
        System.out.printf("%s",maxModel);
    }
}
