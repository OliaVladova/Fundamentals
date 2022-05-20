package SoftUni.Fundamentals.ExerciseArrays;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagons];
        int sumPassengers = 0;
        for (int i = 0; i <wagons ; i++) {
            train[i]=Integer.parseInt(scanner.nextLine());
            sumPassengers+=train[i];
            System.out.printf("%d ",train[i]);
        }
        System.out.println();
        System.out.println(sumPassengers);
    }
}
