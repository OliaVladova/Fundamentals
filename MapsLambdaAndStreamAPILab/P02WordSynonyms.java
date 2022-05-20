package SoftUni.Fundamentals.MapsLambdaAndStreamAPILab;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wordsNum = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> dictionary = new LinkedHashMap<>();
        for (int i =0; i<wordsNum;i++){
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            dictionary.putIfAbsent(word,new ArrayList<>());
            dictionary.get(word).add(synonym);

        }
        for (Map.Entry<String,ArrayList<String>> word: dictionary.entrySet()) {
            System.out.printf("%s - %s\n",word.getKey(),String.join(", ",word.getValue()));
        }
    }
}
