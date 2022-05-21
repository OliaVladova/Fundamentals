package SoftUni.Fundamentals.ObjectsAndClassesExercise.Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Students> studentsList = new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String[] studentInfo = scanner.nextLine().split(" ");

            String firstName = studentInfo[0];
            String lastName = studentInfo[1];
            float grade = Float.parseFloat(studentInfo[2]);

            Students student = new Students(firstName,lastName,grade);
            studentsList.add(student);

        }
        studentsList.sort(Comparator.comparing(Students::getGrade).reversed());
        for (Students student:studentsList) {
            System.out.printf("%s %s: %.2f\n",student.getFirstName(),student.getLastName(),student.getGrade());
        }
    }
}
