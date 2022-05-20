package SoftUni.Fundamentals.ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxPeople = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String[] command = input.split(" ");
            if (command.length>1){
                int num = Integer.parseInt(command[1]);
                wagons.add(num);
            }else {
                int passengers = Integer.parseInt(command[0]);
                for (int i = 0; i <wagons.size() ; i++) {
                    if (wagons.get(i)+passengers<=maxPeople){
                        int people = wagons.get(i)+passengers;
                        wagons.set(i,people);
                        break;
                    }
                }
            }
            input=scanner.nextLine();
        }
        System.out.println(wagons.toString().replaceAll("[\\[\\],]", ""));
    }
}
