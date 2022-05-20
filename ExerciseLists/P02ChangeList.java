package SoftUni.Fundamentals.ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNum = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String inputCom = scanner.nextLine();

        while (!inputCom.equals("end")){
            String[] command = inputCom.split(" ");

            if (command.length>2){
                int element = Integer.parseInt(command[1]);
                int position = Integer.parseInt(command[2]);
                listNum.add(position,element);

            }else {
                int num = Integer.parseInt(command[1]);
                for (int i = 0; i < listNum.size() ; i++) {
                    if (listNum.get(i)==num){
                        listNum.remove(i);
                        i--;
                    }
                }
            }
            inputCom=scanner.nextLine();
        }
        System.out.println(listNum.toString().replaceAll("[\\[\\],]",""));
    }
}
