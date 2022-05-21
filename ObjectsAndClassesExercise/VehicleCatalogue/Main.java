package SoftUni.Fundamentals.ObjectsAndClassesExercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<VehicleCatalogue> catalog = new ArrayList<>();
        while (!input.equals("End")){
            String[] command = input.split(" ");
            String type = command[0];
            String model = command[1];
            String color = command[2];
            String horsepower = command[3];
             VehicleCatalogue vehicle = new VehicleCatalogue(type,model,color,horsepower);
             catalog.add(vehicle);
             input=scanner.nextLine();
        }
        String newInput = scanner.nextLine();
        while (!newInput.equals("Close the Catalogue")){
            String model = newInput;

            for (VehicleCatalogue modelVehicle:catalog) {
                if (model.equals(modelVehicle.getModel())){
                    System.out.println(modelVehicle);
                    break;
                }

            }
            newInput = scanner.nextLine();
        }
        double averageHorsepowerCars = 0;
        double averageHorsepowerTrucks = 0;
        int countCars = 0;
        int countTrucks= 0;
        for (VehicleCatalogue vehicle:catalog) {
            if (vehicle.getTypeOfVehicle().equals("car")) {
                averageHorsepowerCars += Double.parseDouble(vehicle.getHorsepower());
                countCars++;
            }else if (vehicle.getTypeOfVehicle().equals("truck")){
                averageHorsepowerTrucks+=Double.parseDouble(vehicle.getHorsepower());
                countTrucks++;
            }
        }
        if (countCars==0){
            averageHorsepowerCars=0;
            averageHorsepowerTrucks/=countTrucks;
        }else if (countTrucks==0){
            averageHorsepowerCars/= countCars;
            averageHorsepowerTrucks=0;
        }else {
            averageHorsepowerCars /= countCars;
            averageHorsepowerTrucks /= countTrucks;
        }
        System.out.printf("Cars have average horsepower of: %.2f.\n",averageHorsepowerCars);
        System.out.printf("Trucks have average horsepower of: %.2f.",averageHorsepowerTrucks);
    }
}
