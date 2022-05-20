package SoftUni.Fundamentals.ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int minSize = Math.min(firstList.size(), secondList.size());

        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i <minSize ; i++) {
            int firstNum = firstList.get(i);
            int secondNum = secondList.get(i);
            sumList.add(firstNum);
            sumList.add(secondNum);
        }
        if (firstList.size()> secondList.size()){
            sumList.addAll(firstList.subList(minSize, firstList.size()));
        }else {
            sumList.addAll(secondList.subList(minSize, secondList.size()));
        }
        for (int element:sumList) {
            System.out.printf("%d ",element);
        }

    }
}
