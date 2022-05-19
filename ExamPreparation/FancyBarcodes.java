package SoftUni.Fundamentals.ExamPreparation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int productNum = Integer.parseInt(scanner.nextLine());
        Pattern pattern = Pattern.compile("@#+([A-Z][A-Za-z0-9]{4,})([A-Z])@#+");

        for (int i = 0; i < productNum; i++) {
            String input = scanner.nextLine();
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {

                StringBuilder group = new StringBuilder();
                for (int j = 0; j < input.length(); j++) {
                    char symbol = input.charAt(j);
                    if (Character.isDigit(symbol)) {
                        group.append(symbol);
                    }
                }
                if (group.length()==0){
                    System.out.println("Product group: 00");
                }else {
                    System.out.printf("Product group: %s\n",group);
                }
            } else {
                System.out.println("Invalid barcode");
            }

        }
    }
}
