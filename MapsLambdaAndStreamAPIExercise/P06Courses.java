package SoftUni.Fundamentals.MapsLambdaAndStreamAPIExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> course = new LinkedHashMap<>();

        while (!input.equals("end")) {
            List<String> register = Arrays
                    .stream(input.split(" : "))
                    .collect(Collectors.toList());

            String courseName = register.get(0);
            String studentName = register.get(1);
            if (!course.containsKey(courseName)){
                course.put(courseName, new ArrayList<>());
            }
                course.get(courseName).add(studentName);


            input = scanner.nextLine();
        }
        course.entrySet().stream()
                .sorted((e1,e2) -> Integer.compare(e2.getValue().size(), e1.getValue().size()))
                        .forEach(entry ->{
                            System.out.println(entry.getKey() + ": " + entry.getValue().size());
                            entry.getValue().stream().sorted().forEach(studentName -> System.out.println("-- " + studentName));
                        });
    }
}
