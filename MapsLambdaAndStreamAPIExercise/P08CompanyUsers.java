package SoftUni.Fundamentals.MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<String>> companyUsers = new LinkedHashMap<>();
        while (!input.equals("End")){
            String[] command = input.split(" -> ");
            String compName = command[0];
            String id = command[1];
            if (companyUsers.containsKey(compName)){
                List<String> employees = companyUsers.get(compName);
                if (!employees.contains(id)){
                   employees.add(id);
                }

            }else {
                List<String> employees = new ArrayList<>();
                employees.add(id);
                companyUsers.put(compName,employees);
            }

            input = scanner.nextLine();
        }
        companyUsers.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(company -> {
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee -> System.out.println("-- " + employee));
                });
    }
}
