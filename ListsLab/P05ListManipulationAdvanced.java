package SoftUni.Fundamentals.ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
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
                case "Contains":
                    int number = Integer.parseInt(com[1]);
                    boolean isFound = listNum.contains(number);
                    if (isFound){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String kind = com[1];
                    if (kind.equals("even")){
                        for (int i = 0; i < listNum.size() ; i++) {
                            if (listNum.get(i)%2==0){
                                System.out.printf("%d ",listNum.get(i));
                            }
                        }
                        System.out.println();
                    }else if (kind.equals("odd")){
                        for (int i = 0; i < listNum.size() ; i++) {
                            if (listNum.get(i)%2!=0){
                                System.out.printf("%d ",listNum.get(i));
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int element:listNum) {
                        sum+=element;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition = com[1];
                    int num = Integer.parseInt(com[2]);
                    switch (condition){
                        case "<":
                            for (int elements:listNum) {
                                if (elements<num){
                                    System.out.printf("%d ",elements);
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int elements:listNum) {
                                if (elements>num){
                                    System.out.printf("%d ",elements);
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int elements:listNum) {
                                if (elements>=num){
                                    System.out.printf("%d ",elements);
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int elements:listNum) {
                                if (elements<=num){
                                    System.out.printf("%d ",elements);
                                }
                            }
                            System.out.println();
                            break;
                    }
            }
            command= scanner.nextLine();
        }
    }
}
