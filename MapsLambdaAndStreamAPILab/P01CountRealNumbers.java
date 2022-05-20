package SoftUni.Fundamentals.MapsLambdaAndStreamAPILab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] inputNum = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap<Double, Integer> count = new TreeMap<>();

        for (double number:inputNum) {
            if (!count.containsKey(number)){
                count.put(number,0);
            }
            count.put(number,count.get(number)+1);
        }

        for (Map.Entry<Double, Integer> entry : count.entrySet()){
            DecimalFormat format = new DecimalFormat("#.####");
            System.out.printf("%s -> %d\n",format.format(entry.getKey()),entry.getValue());
        }
    }
}
