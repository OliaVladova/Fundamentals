package SoftUni.Fundamentals.ListsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> listNumber = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0;i< listNumber.size()-1;i++){
            if (listNumber.get(i).equals(listNumber.get(i + 1))){
                listNumber.set(i, listNumber.get(i)+listNumber.get(i+1));
                listNumber.remove(i+1);
                i=-1;
            }
        }
        String output = joinElements(listNumber," ");
        System.out.println(output);
    }
    public static String joinElements (List<Double> list,String delimiter){
        String output = "";
        for (double element:list) {
            output+=(new DecimalFormat("0.#").format(element)+delimiter);
        }
        return output;
    }
}
