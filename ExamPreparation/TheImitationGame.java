package SoftUni.Fundamentals.ExamPreparation;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String encrypted = scanner.nextLine();
        String inputCom = scanner.nextLine();

        while (!inputCom.equals("Decode")){
            String[] command = inputCom.split("\\|");
            switch (command[0]){
                case "Move":
                    int number = Integer.parseInt(command[1]);
                    String substring = encrypted.substring(0,number);
                    encrypted=encrypted.replace(substring,"");
                    encrypted=encrypted+substring;
                    break;
                case "Insert":
                    int index = Integer.parseInt(command[1]);
                    String value = command[2];
                    String firstSub = encrypted.substring(0,index);
                    String secondSub = encrypted.substring(index);
                    encrypted=firstSub+value+secondSub;
                    break;
                case "ChangeAll":
                    String subStr = command[1];
                    String replacement = command[2];
                    encrypted=encrypted.replace(subStr,replacement);
                    break;
            }

            inputCom = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s",encrypted);
    }

}
