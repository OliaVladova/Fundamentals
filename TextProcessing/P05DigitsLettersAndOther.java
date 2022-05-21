package SoftUni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder letter = new StringBuilder();
        StringBuilder number = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {

            char symbol = input.charAt(i);
            if (Character.isLetter(symbol)){
                letter.append(symbol);
            }else if (Character.isDigit(symbol)){
                number.append(symbol);
            }else {
                other.append(symbol);
            }
        }
        System.out.println(number);
        System.out.println(letter);
        System.out.println(other);
    }
}
