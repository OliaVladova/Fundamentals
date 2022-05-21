package SoftUni.Fundamentals.TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (String bannedWord:bannedWords) {
            if (text.contains(bannedWord)){
                String replacement = repeatString("*",bannedWord.length());
               text = text.replace(bannedWord,replacement);
            }
        }
        System.out.println(text);

    }
    public static String  repeatString (String word, int count){
        String[] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr[i] = word;
        }

        return String.join("", repeatArr);
    }
}
