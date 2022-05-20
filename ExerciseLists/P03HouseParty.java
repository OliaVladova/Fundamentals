package SoftUni.Fundamentals.ExerciseLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int commandsNum =Integer.parseInt(scanner.nextLine());
        List<String> listNames = new ArrayList<>();
        for (int i = 0; i <commandsNum ; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (input.length>3){
                String name = input[0];
                if (listNames.contains(name)){
                   listNames.remove(name);
                }else {
                    System.out.printf("%s is not in the list!\n",name);
                }
            }else {
                String name = input[0];
               if (listNames.contains(name)){
                   System.out.printf("%s is already in the list!\n",name);
                }else {
                   listNames.add(name);
               }
            }
        }
        for (int i = 0; i <listNames.size() ; i++) {
            System.out.printf("%s\n",listNames.get(i));
        }
    }
}
