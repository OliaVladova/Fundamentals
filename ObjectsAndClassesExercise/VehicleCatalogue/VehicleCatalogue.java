package SoftUni.Fundamentals.ObjectsAndClassesExercise.VehicleCatalogue;


public class VehicleCatalogue {
    private String typeOfVehicle;
    private String model;
    private String color;
    private String horsepower;

    public VehicleCatalogue(String typeOfVehicle, String model, String color, String horsepower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsepower(String horsepower) {
        this.horsepower = horsepower;
    }

    public String getColor() {
        return color;
    }

    public String getHorsepower() {
        return horsepower;
    }
    @Override
    public String toString() {
        //Type: {typeOfVehicle}
        //Model: {modelOfVehicle}
        //Color: {colorOfVehicle}
        //Horsepower: {horsepowerOfVehicle}
        String formattedType = "";
        if (this.typeOfVehicle.equals("car")) {
            formattedType = "Car";
        } else if (this.typeOfVehicle.equals("truck")) {
            formattedType = "Truck";
        }
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %s", formattedType, this.model, this.color, this.horsepower);
    }
}
