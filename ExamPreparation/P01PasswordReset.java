package SoftUni.Fundamentals.ExamPreparation;

import java.util.Scanner;

public class P01PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Done")){
            String[] command =input.split(" ");
            switch (command[0]){
                case "TakeOdd":
                    String newPass = "";
                    for (int i = 1; i <password.length() ; i=i+2) {
                        newPass+=password.charAt(i);
                    }
                    password=newPass;
                    System.out.println(password);
                    break;
                case "Cut":
                    int index = Integer.parseInt(command[1]);
                    int length = Integer.parseInt(command[2]);
                    String substring = password.substring(index,index+length);
                    password=password.replaceFirst(substring,"");
                    System.out.println(password);
                    break;
                case "Substitute":
                    String subStr = command[1];
                    String substitute = command[2];
                    if (password.contains(subStr)){
                        password=password.replaceAll(subStr,substitute);
                        System.out.println(password);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s",password);
    }
}
