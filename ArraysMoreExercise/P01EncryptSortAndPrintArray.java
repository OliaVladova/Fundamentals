package SoftUni.Fundamentals.ArraysMoreExercise;

import java.util.Scanner;

public class P01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStrings = Integer.parseInt(scanner.nextLine());
        String[] array = new String[numberOfStrings];
        for (int i = 0; i < numberOfStrings; i++) {
            String text = scanner.nextLine();
            array[i] = text;
        }

        int[] nameArray = new int[numberOfStrings];
        for (int i =0;i<array.length;i++) {
            String element = array[i];
            int vowels = 0;
            int consonant = 0;
            int total = 0;
            for (int start = 0; start < element.length(); start++) {
                char character = element.charAt(start);
                int charValue = 0;
                switch (character) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        charValue = character * element.length();
                        vowels += charValue;
                        break;
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        charValue = character / element.length();
                        consonant += charValue;
                }
            }
            total = vowels + consonant;
            nameArray[i] = total;
        }
        int[] finalArray = new int[numberOfStrings];


            for (int j = 1; j < nameArray.length-1 ; j++) {
                int number = nameArray[j];
                if (nameArray[j] < nameArray[j-1]) {
                   finalArray[j-1]=nameArray[j];
                 //  finalArray[i+1]=number;
                   break;
                }else{
                    finalArray[j-1]=nameArray[j-1];
                }


        }
        for (int printStart = 0; printStart < finalArray.length ; printStart++) {
            System.out.println(finalArray[printStart]);
        }
    }
}
