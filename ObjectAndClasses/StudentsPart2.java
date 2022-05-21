package SoftUni.Fundamentals.ObjectAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentsPart2 {
    private String firstName;
    private String lastName;
    private String age;
    private String hometown;

    public StudentsPart2(String firstName, String lastName, String age, String hometown) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.hometown = hometown;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<StudentsPart2> studentsList = new ArrayList<>();

        while (!command.equals("end")) {
            List<String> studentList = Arrays
                    .stream(command.split(" "))
                    .collect(Collectors.toList());

            String firstName = studentList.get(0);
            String lastName = studentList.get(1);
            String age = studentList.get(2);
            String hometown = studentList.get(3);

            if (studentExist(studentsList,firstName,lastName)){
                StudentsPart2 student = getStudent(studentsList,firstName,lastName);
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(hometown);

            }else {
                StudentsPart2 student = new StudentsPart2(firstName, lastName, age, hometown);
                studentsList.add(student);
            }


            command = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (StudentsPart2 student : studentsList) {
            if (student.getHometown().equals(cityName)) {
                System.out.printf("%s %s is %s years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    private static boolean studentExist(List<StudentsPart2> studentsList, String firstName, String lastName) {
        for (StudentsPart2 student : studentsList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
    private static StudentsPart2 getStudent(List<StudentsPart2> studentsList, String firstName, String lastName){
        StudentsPart2 existingStudent = null;
        for (StudentsPart2 student:studentsList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }

}
