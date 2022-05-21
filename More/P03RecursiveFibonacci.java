package SoftUni.Fundamentals.More;

import java.util.Scanner;

public class P03RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] fibonacci = new int[num];
        int first = 0;
        int second = 0;
        int next = 0;
        for (int i = 0; i <num ; i++) {
            if (i==0||i==1){
                fibonacci[i] = 1;
            }else {
                 first = fibonacci[i - 2];
                 second = fibonacci[i - 1];
                 next = first + second;
                fibonacci[i] = next;
            }
        }
        System.out.printf("%d",fibonacci[num-1]);
    }
}
