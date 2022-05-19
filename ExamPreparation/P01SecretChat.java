package SoftUni.Fundamentals.ExamPreparation;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] command = input.split(":\\|:");
            switch (command[0]){
                case "InsertSpace":
                    int index = Integer.parseInt(command[1]);
                    String firstStr = message.substring(0,index);

                    String secondStr = message.substring(index);
                    message=firstStr+" "+secondStr;
                    System.out.println(message);
                    break;
                case "Reverse":
                    String subSrt = command[1];
                    if (message.contains(subSrt)){
                        message=message.replaceFirst(subSrt,"");
                        String replacement="";

                        for (int i = subSrt.length()-1; i >=0 ; i--) {
                            replacement+=subSrt.toCharArray()[i];
                        }
                        message+=replacement;
                        System.out.println(message);

                    }else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String subString = command[1];
                    String replacement = command[2];
                    message=message.replaceAll(subString,replacement);
                    System.out.println(message);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",message);
    }
}
