package SoftUni.Fundamentals.ExamPreparation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("([:]{2}|[*]{2})(?<letters>[A-Z][a-z]{2,})(\\1)");
        Matcher matcherEmoji = pattern.matcher(input);

        int coolThreshold = 1;
        for (char symbol : input.toCharArray()) {
            if (Character.isDigit(symbol)) {
                coolThreshold *= Integer.parseInt(symbol + "");
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);
        List<String> coolEmoji = new ArrayList<>();
        int count = 0;
        while (matcherEmoji.find()) {
            String letters = matcherEmoji.group("letters");
            count++;
            int coolSum = 0;
            for (int i = 0; i < letters.length(); i++) {
                char letter = letters.charAt(i);
                coolSum+=(int)letter;
            }
            if (coolSum>=coolThreshold){

                coolEmoji.add(matcherEmoji.group());
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:\n",count);
        coolEmoji.forEach(emoji -> System.out.println(emoji));
    }
}
