package SoftUni.Fundamentals.ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNum = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        listNum.removeIf(n->n<0);
        boolean hasPositive = false;
        for (int element:listNum) {
            if (element>0){
                hasPositive=true;
            }
        }
        Collections.reverse(listNum);
        if (!hasPositive){
            System.out.println("empty");
        }else {
            System.out.println(listNum.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
