package Inheritance;

public class StudentAssistant extends Student{
    int hoursRendered;

    StudentAssistant(
            String firpstName,
            String middleName,
            String lastName,
            Gender gender,
            int age,
            double height,
            double weight,
            String program,
            String studentNumber,
            int yearLevel,
            int hoursRendered
    ) {
        super(firstName, middleName, lastName, gender, age, height, weight, program, studentNumber, yearLevel);
        this.hoursRendered = hoursRendered;

    }
}
