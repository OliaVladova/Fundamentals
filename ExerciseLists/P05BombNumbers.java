package SoftUni.Fundamentals.ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNum = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String[] bombNum = scanner.nextLine().split(" ");
        int power = Integer.parseInt(bombNum[1]);
        int num = Integer.parseInt(bombNum[0]);

      while (listNum.contains(num)){
          int index = listNum.indexOf(num);
          int left = Math.max(0,index-power);
          int right = Math.min(index+power,listNum.size()-1);
          for (int i = right; i >=left ; i--) {
              listNum.remove(i);
          }
      }
        int sum = 0;
        for (int i = 0;i<listNum.size();i++ ) {
            sum+=listNum.get(i);
        }
        System.out.println(sum);
    }
}
