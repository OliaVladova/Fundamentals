package SoftUni.Fundamentals.ExerciseBasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        double total = 0;

        switch (day) {
            case "Friday":
                switch (type) {
                    case "Students":
                        price = 8.45;
                        break;
                    case "Business":
                        price = 10.9;
                        break;
                    case "Regular":
                        price = 15;
                        break;
                }
                break;
            case "Saturday":
                switch (type) {
                    case "Students":
                        price = 9.8;
                        break;
                    case "Business":
                        price = 15.6;
                        break;
                    case "Regular":
                        price = 20;
                        break;
                }
                break;
            case "Sunday":
                switch (type) {
                    case "Students":
                        price = 10.46;
                        break;
                    case "Business":
                        price = 16;
                        break;
                    case "Regular":
                        price = 22.5;
                        break;
                }
                break;
        }
        total=price*people;
        if (type.equals("Students")&&people>=30){
            total*=0.85;
        }else if (type.equals("Business")&&people>=100){
            total=total-10*price;
        }else if (type.equals("Regular")&&people>=10&&people<=20){
            total*=0.95;
        }
        System.out.printf("Total price: %.2f",total);
    }
}
