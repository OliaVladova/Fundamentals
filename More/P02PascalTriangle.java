package SoftUni.Fundamentals.More;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class P02PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int[] triangle = new int[num];
        for (int i = 1; i <=num ; i++) {
            int[] newArr = new int[i];
            for (int j = 0; j <newArr.length ; j++) {
                if (j==newArr.length-1){
                    newArr[j]=1;
                }else if (j==0){
                    newArr[j]=1;
                }else {
                    int next = triangle[j-1];
                    newArr[j]=triangle[j] + next;

                }
            }
            for (int j = 0; j < newArr.length; j++) {
                triangle[j]=newArr[j];
                System.out.printf("%d ",triangle[j]);
            }
            System.out.println();
        }

    }
}
