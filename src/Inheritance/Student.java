package Inheritance;

public class Student extends Person {
    String program;
    String studentNumber;
    int yearLevel;

    public Student(String firstName, String middleName, String lastName, Gender gender, int age, double height, double weight, String program, String studentNumber, int yearLevel, int hoursRendered) {
        this.program = "BS Computer Science";
        this.studentNumber = "2020-10001";
        this.yearLevel = 1;
    }

    public Student(
            String firstName,
            String middleName,
            String lastName,
            Gender gender,
            int age,
            double height,
            double weight,
            String program,
            String studentNumber,
            int yearLevel
    ) {
        super(firstName, middleName, lastName, gender, age, height, weight);
        this.program = program;
        this.studentNumber = studentNumber;
        this.yearLevel = yearLevel;
    }

    public void display(){
        super.display();
        System.out.println("Program: " + program);
        System.out.println("Student Number: " + studentNumber);
        System.out.println("Year Level: " + yearLevel);
    }
}
