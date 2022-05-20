package SoftUni.Fundamentals.ExerciseMethods;

import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[] array = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] com = command.split(" ");
            switch (com[0]) {
                case "exchange":
                    int index = Integer.parseInt(com[1]);
                    if (index> array.length-1){
                        System.out.println("Invalid index");
                    }else {
                        exchange(array, index);
                    }
                    break;
                case "max":
                    String type = com[1];
                    maxElement(array,type);
                    break;
                case "min":
                    String typePosition = com[1];
                    minElement(array,typePosition);
                    break;
                case "first":
                    int count = Integer.parseInt(com[1]);
                    String typeNum = com[2];
                    countFirst(array,count,typeNum);
                    break;
                case "last":
                    break;
            }
            command = scanner.nextLine();
        }

    }

    public static void exchange(int[] array, int index) {
        int[] newArray = new int[array.length];
        int restNum = index;
        for (int i = 0; i <= index; i++) {
            newArray[restNum] = array[i];
            if (index!=i) {
                restNum++;
            }
        }
        int start=0;
        for (int j = index+1; j <= array.length-1 ; j++) {
            newArray[start]=array[j];
            start++;
        }
      /*  System.out.print("[");
        for (int element: newArray) {
            System.out.printf("%d,",element);
        }
        System.out.println("]");*/
    }
    public static void maxElement(int[] array,String type){
        int index=0;
        int maxNumber = Integer.MIN_VALUE;
        boolean isFound = false;
        if (type.equals("even")){
            for (int i = 0; i < array.length ; i++) {
                if (array[i]%2==0) {
                    if (maxNumber <= array[i]) {
                        maxNumber = array[i];
                        index = i;
                    }
                }
            }
            if (isFound) {
                System.out.printf("%d\n", index);
            }else {
                System.out.println("No matches");
            }
        }
        if (type.equals("odd")) {
            for (int i = 0; i < array.length; i ++) {
                if (array[i]%2!=0) {
                    if (maxNumber <= array[i]) {
                        maxNumber = array[i];
                        index = i;
                    }
                }
            }
            if (isFound) {
                System.out.printf("%d\n", index);
            }else {
                System.out.println("No matches");
            }
        }
    }
    public static void minElement(int[] array,String type){
        int index=0;
        int minNumber = Integer.MAX_VALUE;
        boolean isFound = false;
        if (type.equals("even")){
            for (int i = 0; i < array.length ; i++) {
                if (array[i]%2==0) {
                    if (minNumber >= array[i]) {
                        minNumber = array[i];
                        index = i;
                        isFound = true;
                    }
                }
            }
            if (isFound) {
                System.out.printf("%d\n", index);
            }else {
                System.out.println("No matches");
            }
        }
        if (type.equals("odd")) {
            for (int i = 0; i < array.length; i ++) {
                if (array[i]%2!=0) {
                    if (minNumber >= array[i]) {
                        minNumber = array[i];
                        index = i;
                        isFound = true;
                    }
                }
            }
            if (isFound) {
                System.out.printf("%d\n", index);
            }else {
                System.out.println("No matches");
            }
        }
    }
    public static void countFirst(int[] array, int count,String type){
        switch (type){
            case "even":
                if (count>array.length){
                    System.out.println( "Invalid count");
                }else {
                    System.out.print("[");
                    int evenCount =0;
                    for (int i = 0; i < array.length ; i++) {
                        if (array[i]%2==0){
                            if (evenCount!=count) {
                                evenCount++;
                                System.out.printf("%d,", array[i]);
                            }else if (evenCount==0){
                                System.out.println("[]");
                            }else {
                                break;
                            }
                        }
                    }
                }
                break;
            case "odd":
                if (count>array.length){
                    System.out.println( "Invalid count");
                }else {
                    System.out.print("[");
                    int oddCount =0;
                    String print = "[";
                    for (int i = 0; i < array.length ; i++) {
                        if (array[i]%2!=0){
                            if (oddCount!=count) {
                                oddCount++;
                               print+=array[i];
                            }else if (oddCount==0){
                                System.out.println("[]");
                            }else {
                                break;
                            }
                        }

                    }
                }
                break;
        }
    }   private static void lastCountElements(int[] numbers, int count, String command) {
        if (count < 0 || count > numbers.length) {
            System.out.println("Invalid count");
            return;
        }

        int num = command.equals("even") ? 0 : 1;

        int index = 0;
        int[] result = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == num) {
                result[index++] = numbers[i];
            }
        }

        if (index == 0) {
            System.out.println("[]");

        } else {
            int startIndex = index - count;
            if (startIndex < 0) {
                startIndex = 0;
            }
            String output = "[";
            for (int i = startIndex; i < index; i++) {

                if (i < index - 1) {
                    output += result[i] + ", ";
                } else {
                    output += result[i] + "]";
                }
            }
            System.out.println(output);
        }
    }

    }
