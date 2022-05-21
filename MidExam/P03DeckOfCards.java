package SoftUni.Fundamentals.MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03DeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cardsList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        int numLine = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLine; i++) {
            String inputCommand = scanner.nextLine();
            String[] command = inputCommand.split(", ");

            switch (command[0]){
                case "Add":
                    if (cardsList.contains(command[1])){
                        System.out.println("Card is already in the deck");
                    }else {
                        cardsList.add(command[1]);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    if (!cardsList.contains(command[1])){
                    System.out.println("Card not found");
                }else {
                    cardsList.remove(command[1]);
                    System.out.println("Card successfully removed");
                }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(command[1]);
                    if (index<cardsList.size()){
                        cardsList.remove(index);
                        System.out.println("Card successfully removed");
                    }else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int indexOfCard = Integer.parseInt(command[1]);
                    String nameCard = command[2];
                    if (indexOfCard>=cardsList.size()||indexOfCard<0){
                        System.out.println("Index out of range");
                    }else {
                        if (cardsList.contains(nameCard)){
                            System.out.println("Card is already added");
                        }else {
                            cardsList.add(indexOfCard,nameCard);
                            System.out.println("Card successfully added");
                        }
                    }
                    break;
            }
        }
        System.out.println(cardsList.toString().replaceAll("[\\[\\]]", ""));
    }
}
