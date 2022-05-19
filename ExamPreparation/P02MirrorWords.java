package SoftUni.Fundamentals.ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("(@|#)(?<word1>[A-Za-z]{3,})(\\1)(\\1)(?<word2>[A-Za-z]{3,})(\\1)");
        Matcher matcher = pattern.matcher(text);
       List<String> listStr = new ArrayList<>();

       int counter = 0;
        while (matcher.find()) {
            counter++;
          String word2 = matcher.group("word2");
            StringBuilder reversed = new StringBuilder(word2);
             reversed.reverse();

            String word1 = matcher.group("word1");
            if (word1.equals(reversed.toString())){
                listStr.add(word1 + " <=> "+word2);
            }
        }if (counter!=0) {
            System.out.printf("%d word pairs found!\n", counter);
        }else {
            System.out.println("No word pairs found!");
        }
        if (counter>0&&listStr.size()>0) {
            System.out.println("The mirror words are:");
                System.out.print(String.join(", ",listStr));

        }else {
            System.out.println("No mirror words!");;
        }


    }
}
