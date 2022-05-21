package SoftUni.Fundamentals.ObjectsAndClassesExercise.OrderByAge;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<PersonalInfo> personalInfoList = new ArrayList<>();
        while (!input.equals("End")) {
            String[] inputArr = input.split(" ");
            String name = inputArr[0];
            String id = inputArr[1];
            int age = Integer.parseInt(inputArr[2]);

            PersonalInfo person = new PersonalInfo(name, id, age);
            personalInfoList.add(person);

            input = scanner.nextLine();

        }
        personalInfoList.sort(Comparator.comparing(PersonalInfo::getAge));
        for (PersonalInfo person : personalInfoList) {
            System.out.printf("%s with ID: %s is %d years old.\n",person.getName(),person.getID(),person.getAge());
        }
    }
}
