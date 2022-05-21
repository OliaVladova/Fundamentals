package SoftUni.Fundamentals.TextProcessingExercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] filePath = scanner.nextLine().split("\\\\");

        String fileAndExtension = filePath[filePath.length-1];
        String[]file = fileAndExtension.split("\\.");
        String fileName = file[0];
        String extension = file[1];

        System.out.printf("File name: %s\n",fileName);
        System.out.printf("File extension: %s",extension);

    }
}
