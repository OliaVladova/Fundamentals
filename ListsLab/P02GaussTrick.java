package SoftUni.Fundamentals.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNum = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = listNum.size();
        for (int i = 0; i <size/2 ; i++) {
            listNum.set(i, listNum.get(i)+ listNum.get(listNum.size()-1));
            listNum.remove(listNum.size()-1);

        }
        for (int i = 0; i <listNum.size() ; i++) {
            System.out.printf("%d ",listNum.get(i));
        }
    }
}
