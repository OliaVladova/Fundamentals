package SoftUni.Fundamentals.ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondCards = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int start = Math.min(firstCards.size(),secondCards.size());
            while (secondCards.size()!=0 &&firstCards.size()!= 0){
                int i = 0;
               if (firstCards.get(i)>secondCards.get(i)){
                   firstCards.add(firstCards.get(i));
                   firstCards.add(secondCards.get(i));
                   firstCards.remove(i);
                   secondCards.remove(i);
               }else if (firstCards.get(i)<secondCards.get(i)){
                    secondCards.add(secondCards.get(i));
                    secondCards.add(firstCards.get(i));
                    firstCards.remove(i);
                    secondCards.remove(i);
                }else{
                   firstCards.remove(i);
                   secondCards.remove(i);
               }

            }
        int sum = 0;
        if (secondCards.isEmpty()){

            for (int j = 0; j <firstCards.size() ; j++) {
                sum+= firstCards.get(j);
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }else {
            for (int k = 0; k <secondCards.size() ; k++) {
                sum+= secondCards.get(k);
            }
            System.out.printf("Second player wins! Sum: %d",sum);

        }

    }
}
