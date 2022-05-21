package SoftUni.Fundamentals.TextProcessing;

import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wordMatch = scanner.nextLine();
        String wordInput = scanner.nextLine();
        while (wordInput.indexOf(wordMatch)!=-1){
            wordInput=wordInput.replace(wordMatch,"");
        }
        System.out.println(wordInput);
    }
}
