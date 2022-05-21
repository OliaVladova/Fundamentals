package SoftUni.Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        double totalSum = 0;

        for (String word :input) {
            double modifiedNum = getModifiedNumber(word);
            totalSum+=modifiedNum;
        }
        System.out.printf("%.2f",totalSum);
    }
    private static double getModifiedNumber(String word){
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length()-1);
        StringBuilder builder = new StringBuilder(word);
        double num = Double.parseDouble(builder.deleteCharAt(0).deleteCharAt(builder.length()-1).toString());
        if (Character.isUpperCase(firstLetter)){
            int positionUpperCase= (int) firstLetter-64;
            num/=positionUpperCase;
        }else {
            int positionLowerCase = (int) firstLetter-96;
            num*=positionLowerCase;
        }
        if (Character.isUpperCase(lastLetter)){
            int positionUpperCase= (int) lastLetter-64;
            num-=positionUpperCase;
        }else {
            int positionLowerCase = (int) lastLetter-96;
            num+=positionLowerCase;
        }
        return num;
    }
}
