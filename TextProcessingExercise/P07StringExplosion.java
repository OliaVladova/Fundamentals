package SoftUni.Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int i = 0; i < input.length() ; i++) {
            char symbol = input.charAt(i);
            if (symbol=='>'){
                strength += Integer.parseInt(""+input.charAt(i+1));
            }else if (symbol!='>'&&strength>0){
                input.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(input);
    }
}
