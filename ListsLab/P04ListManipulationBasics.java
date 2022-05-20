package SoftUni.Fundamentals.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNum = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")){
            String[] com = command.split(" ");

            String manipulation = com[0];
            switch (manipulation){
                case "Add":
                    int number = Integer.parseInt(com[1]);
                    listNum.add(number);
                    break;
                case "Remove":
                    int num = Integer.parseInt(com[1]);
                    listNum.remove(Integer.valueOf(num));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(com[1]);
                    listNum.remove(index);
                    break;
                case "Insert":
                    int numToInset = Integer.parseInt(com[1]);
                    int indexInset = Integer.parseInt(com[2]);
                    listNum.add(indexInset,numToInset);
                    break;
            }
            command=scanner.nextLine();
        }
        System.out.println(listNum.toString().replaceAll("[\\[\\],]", ""));
    }
}
