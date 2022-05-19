package SoftUni.Fundamentals.DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class P03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOne = Double.parseDouble(scanner.nextLine());
        double numTwo = Double.parseDouble(scanner.nextLine());

        double difference= Math.abs(numOne-numTwo);
        if (difference<0.000001){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
