package SoftUni.Fundamentals.MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02CoffeeLover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        int numCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numCommands; i++) {
            String inputCom = scanner.nextLine();
            String[] command = inputCom.split(" ");
            switch (command[0]) {
                case "Include":
                    coffeeList.add(command[1]);
                    break;
                case "Remove":
                    int numCoffee = Integer.parseInt(command[2]);

                    if (numCoffee < coffeeList.size()) {
                        switch (command[1]) {
                            case "first":
                                for (int j = 0; j < numCoffee; j++) {
                                    int index = 0;
                                    coffeeList.remove(index);

                                }
                                break;
                            case "last":
                                for (int j = 0; j < numCoffee; j++) {
                                    int indexRemove = coffeeList.size() - 1;
                                    coffeeList.remove(indexRemove);
                                }
                                break;
                        }
                    }
                    break;
                case "Prefer":
                    int firstCoffee = Integer.parseInt(command[1]);
                    int secondCoffee = Integer.parseInt(command[2]);
                    if (firstCoffee < coffeeList.size() && secondCoffee < coffeeList.size()) {
                        String first = coffeeList.get(firstCoffee);
                        String second = coffeeList.get(secondCoffee);
                        coffeeList.set(firstCoffee,second);
                        coffeeList.set(secondCoffee,first);
                    }

                        break;
                case "Reverse":
                    Collections.reverse(coffeeList);
                    break;
                    }

            }
        System.out.println("Coffees: ");
        System.out.println(coffeeList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
