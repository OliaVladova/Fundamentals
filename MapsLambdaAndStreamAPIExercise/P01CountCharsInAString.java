package SoftUni.Fundamentals.MapsLambdaAndStreamAPIExercise;

import java.util.*;
import java.util.stream.Collectors;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Character> symbol = new ArrayList<>();
        for (int i = 0; i <input.length ; i++) {
            String word = input[i];
            for (int j = 0; j <word.length() ; j++) {
                char sym = word.charAt(j);
                        symbol.add(sym);
            }

        }


        LinkedHashMap<Character,Integer> count = new LinkedHashMap<>();
        for (char sym:symbol) {
            if (!count.containsKey(sym)){
                count.put(sym,1);
            }else {
                count.put(sym, count.get(sym)+1);
            }
        }
        for (Map.Entry<Character,Integer>entry:count.entrySet()) {
            System.out.printf("%s -> %d\n", entry.getKey(),entry.getValue());
        }

    }
}
