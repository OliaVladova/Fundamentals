package SoftUni.Fundamentals.ArraysLecture;

import java.util.Scanner;

public class P01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        int numberOfDay = Integer.parseInt(scanner.nextLine());
        if (numberOfDay >= 1 && numberOfDay <= 7){
            System.out.println(day[numberOfDay-1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
