package SoftUni.Fundamentals.ObjectsAndClassesExercise.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numPeople = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i <numPeople ; i++) {
            String[] input = scanner.nextLine().split(" ");
            int age = Integer.parseInt(input[1]);

            if (age>30){
                Person person = new Person(input[0],age);
                personList.add(person);
            }
        }
        personList.sort(Comparator.comparing(Person::getName));
        for (Person person :personList) {
            System.out.printf("%s - %d\n",person.getName(),person.getAge());
        }
    }
}
