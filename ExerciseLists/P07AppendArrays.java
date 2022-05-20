package SoftUni.Fundamentals.ExerciseLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

        Collections.reverse(inputList);
        System.out.println(inputList.toString().replaceAll("[\\[\\],]","").trim().replaceAll(",", "").replaceAll("\\s+"," "));
    }
}
