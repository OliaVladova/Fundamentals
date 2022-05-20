package SoftUni.Fundamentals.MapsLambdaAndStreamAPILab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        LinkedHashMap< String, Integer> count = new LinkedHashMap<>();

        for (String word:words) {
            String lowered = word.toLowerCase();
            if (!count.containsKey(lowered)){
                count.put(lowered,1);
            }else {
                count.put(lowered, count.get(lowered)+1);
            }
        }
        List<String> odd = new ArrayList<>();
        for (Map.Entry<String, Integer>entry:count.entrySet()) {
            if (entry.getValue()%2!=0){
                odd.add(entry.getKey());
            }
        }
        for (int i = 0;i< odd.size();i++) {
            System.out.print(odd.get(i));
            if (i<odd.size()-1){
                System.out.print(", ");
            }
        }
    }
}
