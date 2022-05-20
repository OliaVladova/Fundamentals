package SoftUni.Fundamentals.ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        double sum = 0;
        while (!command.equals("Start")) {
            double coins = Double.parseDouble(command);
            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
               sum+=coins;
            }else {
                System.out.printf("Cannot accept %.2f\n",coins);
            }
            command = scanner.nextLine();
        }
        String newCommand = scanner.nextLine();
        while (!newCommand.equals("End")){
            String product = newCommand;
            switch (product){
                case "Nuts":
                    if (sum>=2){
                        sum-=2;
                        System.out.printf("Purchased %s\n",product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum>=0.7){
                        sum-=0.7;
                        System.out.printf("Purchased %s\n",product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum>=1.5){
                        sum-=1.5;
                        System.out.printf("Purchased %s\n",product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Soda":
                    if (sum>=0.8){
                        sum-=0.8;
                        System.out.printf("Purchased %s\n",product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Coke":
                    if (sum>=1){
                        sum-=1;
                        System.out.printf("Purchased %s\n",product);
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            newCommand=scanner.nextLine();
        }
        if (newCommand.equals("End")){
            System.out.printf("Change: %.2f",sum);
        }
    }
}
