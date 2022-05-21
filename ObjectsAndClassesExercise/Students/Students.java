package SoftUni.Fundamentals.ObjectsAndClassesExercise.Students;

public class Students {
    private String firstName;
    private String lastName;
    private float grade;

    public Students(String firstName, String lastName, float grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public float getGrade(){
        return grade;
    }
}
