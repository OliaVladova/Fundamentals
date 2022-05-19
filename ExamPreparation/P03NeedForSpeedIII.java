package SoftUni.Fundamentals.ExamPreparation;

import java.util.*;

public class P03NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCars = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> cars = new TreeMap<>();
        for (int i = 0; i < numCars; i++) {
            String[] carInput = scanner.nextLine().split("\\|");
            List<Integer> mileageAndFuel = new ArrayList<>();
            mileageAndFuel.add(Integer.parseInt(carInput[1]));
            mileageAndFuel.add(Integer.parseInt(carInput[2]));
            cars.put(carInput[0], mileageAndFuel);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] command = input.split(" : ");
            String carDrive = command[1];
            switch (command[0]) {
                case "Drive":
                    int distance = Integer.parseInt(command[2]);
                    int neededFuel = Integer.parseInt(command[3]);
                    if (cars.containsKey(carDrive)) {
                        if (cars.get(carDrive).get(1) < neededFuel) {
                            System.out.println("Not enough fuel to make that ride");
                        } else {
                            List<Integer> listDrive = new ArrayList<>();
                            listDrive.add(distance + cars.get(carDrive).get(0));
                            listDrive.add(cars.get(carDrive).get(1) - neededFuel);
                            cars.put(carDrive, listDrive);
                            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", carDrive,distance,neededFuel);
                        }
                        if (cars.get(carDrive).get(0) >= 100000) {
                            System.out.printf("Time to sell the %s!\n", carDrive);
                            cars.remove(carDrive);
                        }
                    }

                    break;
                case "Refuel":
                    int fuelToRefill = Integer.parseInt(command[2]);
                    if (cars.containsKey(carDrive)){
                        int sumLitres = cars.get(carDrive).get(1)+fuelToRefill;
                        if (sumLitres>75){
                            List<Integer> refuel = new ArrayList<>();
                            refuel.add(cars.get(carDrive).get(0));
                            refuel.add(75);
                            cars.put(carDrive,refuel);
                            int left = sumLitres-75;
                            fuelToRefill = fuelToRefill-left;

                        }else{
                            List<Integer> refuel = new ArrayList<>();
                            refuel.add(cars.get(carDrive).get(0));
                            refuel.add(sumLitres);
                            cars.put(carDrive,refuel);
                        }
                        System.out.printf("%s refueled with %d liters\n",carDrive,fuelToRefill);
                    }
                    break;
                case "Revert":
                    int km = Integer.parseInt(command[2]);
                    if (cars.containsKey(carDrive)){
                        int newMileage = cars.get(carDrive).get(0)-km;
                        if (newMileage>10000){
                            List<Integer> mileage = new ArrayList<>();
                            mileage.add(newMileage);
                            mileage.add(cars.get(carDrive).get(1));
                            cars.put(carDrive,mileage);
                            System.out.printf("%s mileage decreased by %d kilometers\n",carDrive,km);
                        }else {
                            List<Integer> mileage = new ArrayList<>();
                            mileage.add(10000);
                            mileage.add(cars.get(carDrive).get(1));
                            cars.put(carDrive,mileage);
                        }
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        cars.entrySet().stream().sorted((e1,e2)->e2.getValue().get(0).compareTo(e1.getValue().get(0))).forEach((entry->{
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",entry.getKey(),entry.getValue().get(0),entry.getValue().get(1));
        }));
    }
}
