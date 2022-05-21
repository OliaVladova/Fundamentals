package SoftUni.Fundamentals.ObjectsAndClassesExercise.OrderByAge;

public class PersonalInfo {
    private String name;
    private String ID;
    private int age;

    public PersonalInfo(String name, String ID, int age){
        this.name = name;
        this.ID=ID;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public int getAge() {
        return age;
    }

}

