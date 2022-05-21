package SoftUni.Fundamentals.ObjectsAndClassesExercise.Articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main  {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputText = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String title = inputText.get(0);
        String content = inputText.get(1);
        String author = inputText.get(2);
        Articles article = new Articles(title,content,author);
        int commandNum = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <commandNum ; i++) {
            String[] command = scanner.nextLine().split(": ");
            String com = command[0];
            switch (com){
                case "Edit":
                    article.editContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.rename(command[1]);
                    break;

            }
        }
        System.out.println(article);
    }
}
