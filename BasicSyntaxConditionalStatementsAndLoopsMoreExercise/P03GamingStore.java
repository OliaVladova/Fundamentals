package SoftUni.Fundamentals.BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class P03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0;
        double money = balance;
        while (!command.equals("Game Time")) {
            String game = command;
            if (balance <= 0) {
                System.out.println("Out of money!");
                break;
            }
            switch (game) {
                case "OutFall 4":
                    price=39.99;
                    if (price>balance){
                        System.out.println("Too Expensive");
                    }else{
                        balance-=price;
                        System.out.printf("Bought %s\n",game);
                    }
                    break;
                case "CS: OG":
                    price=15.99;
                    if (price>balance){
                        System.out.println("Too Expensive");
                    }else{
                        balance-=price;
                        System.out.printf("Bought %s\n",game);
                    }
                    break;
                case "Zplinter Zell":
                    price=19.99;
                    if (price>balance){
                        System.out.println("Too Expensive");
                    }else{
                        balance-=price;
                        System.out.printf("Bought %s\n",game);
                    }
                    break;
                case "Honored 2":
                    price=59.99;
                    if (price>balance){
                        System.out.println("Too Expensive");
                    }else{
                        balance-=price;
                        System.out.printf("Bought %s\n",game);
                    }
                    break;
                case "RoverWatch":
                    price=29.99;
                    if (price>balance){
                        System.out.println("Too Expensive");
                    }else{
                        balance-=price;
                        System.out.printf("Bought %s\n",game);
                    }
                    break;
                case "RoverWatch Origins Edition":
                    price=39.99;
                    if (price>balance){
                        System.out.println("Too Expensive");
                    }else{
                        balance-=price;
                        System.out.printf("Bought %s\n",game);
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            command = scanner.nextLine();
        }
        double spent = money-balance;
        if (balance==0){
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spent, balance);
        }
    }
}
