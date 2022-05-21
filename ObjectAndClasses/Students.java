package SoftUni.Fundamentals.ObjectAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Students {
    private String firstName;
    private String lastName;
    private String age;
    private String hometown;

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

    public String getAge(){
        return age;
    }
    public  void setAge(String age){
        this.age = age;
    }

    public String getHometown(){
        return hometown;
    }
    public void setHometown(String hometown){
        this.hometown = hometown;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Students> studentsList = new ArrayList<>();

        while (!command.equals("end")){
            List<String> studentList = Arrays
                    .stream(command.split(" "))
                    .collect(Collectors.toList());

            Students student = new Students();
            student.setFirstName(studentList.get(0));
            student.setLastName(studentList.get(1));
            student.setAge(studentList.get(2));
            student.setHometown(studentList.get(3));

            studentsList.add(student);
            command = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        for (Students student:studentsList ) {
            if (student.getHometown().equals(cityName)){
                System.out.printf("%s %s is %s years old\n",student.getFirstName(),student.getLastName(),student.getAge());
            }
        }
    }
}
