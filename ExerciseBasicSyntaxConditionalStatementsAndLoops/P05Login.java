package SoftUni.Fundamentals.ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();

        String newPass = "";
        int counter = 0;

        for (int i = user.length() - 1; i >=0; i--) {
            char symbol = user.charAt(i);
            newPass += symbol;
        }
        String input = scanner.nextLine();
        while (!input.equals(newPass)) {
            counter++;
            if (counter==4){
                System.out.printf("User %s blocked!",user);
                break;
            }else {
                System.out.println("Incorrect password. Try again.");
            }
            input=scanner.nextLine();
        }
        if (input.equals(newPass)){
            System.out.printf("User %s logged in.",user );
        }

    }
}
