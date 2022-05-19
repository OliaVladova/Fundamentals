package SoftUni.Fundamentals.ExamPreparation;

import java.util.*;

public class ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> piecesMap = new TreeMap<>();
        for (int i = 0; i < number; i++) {
            String[] inputPieces = scanner.nextLine().split("\\|");
            String piece = inputPieces[0];
            String composer = inputPieces[1];
            String key = inputPieces[2];
            List<String> listInput = new ArrayList<>();
            listInput.add(composer);
            listInput.add(key);
            piecesMap.put(piece, listInput);
        }

        String commandInput = scanner.nextLine();

        while (!commandInput.equals("Stop")) {
            String[] input = commandInput.split("\\|");
            List<String> list = new ArrayList<>();
            String piece = input[1];
            switch (input[0]) {
                case "Add":
                    String composer = input[2];
                    String key = input[3];
                    if (!piecesMap.containsKey(piece)) {
                        list.add(composer);
                        list.add(key);
                        piecesMap.put(piece, list);
                        System.out.printf("%s by %s in %s added to the collection!\n", piece, composer, key);
                    } else {
                        System.out.printf("%s is already in the collection!\n", piece);
                    }
                    break;
                case "Remove":
                    if (piecesMap.containsKey(piece)) {
                        piecesMap.remove(piece);
                        System.out.printf("Successfully removed %s!\n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }
                    break;
                case "ChangeKey":
                    String keyToChange = input[2];
                    if (piecesMap.containsKey(piece)) {
                        List<String> newInfo = piecesMap.get(piece);
                       newInfo.remove(1);
                       newInfo.add(1,keyToChange);
                        piecesMap.replace(piece,newInfo);
                        System.out.printf("Changed the key of %s to %s!\n",piece,keyToChange);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.\n", piece);
                    }

                    break;
            }
            commandInput = scanner.nextLine();
        }
        for (Map.Entry<String,List<String>> entry: piecesMap.entrySet() ) {
            System.out.printf("%s -> Composer: %s, Key: %s\n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }
    }
}
