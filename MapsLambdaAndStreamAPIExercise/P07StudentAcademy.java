package SoftUni.Fundamentals.MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numStudents = Integer.parseInt(scanner.nextLine());
        Map<String , List<Double>> studentsGrade = new LinkedHashMap<>();

        for (int i = 0; i < numStudents; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsGrade.containsKey(studentName)){
                studentsGrade.put(studentName,new ArrayList<>());
            }
            studentsGrade.get(studentName).add(grade);
        }

        Map<String, Double> studentAverage = new LinkedHashMap<>();
        for (Map.Entry<String , List<Double>>entry:studentsGrade.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();
            double grade = getAverageGrade(grades);

            if (grade>=4.5){
                studentAverage.put(studentName,grade);
            }
        }
        studentAverage.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .forEach(entry -> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
    public static double getAverageGrade(List<Double> listGrade){
        double average = 0;
        for (Double grade:listGrade) {
            average+=grade;
        }
        return average/ listGrade.size();
    }
}
