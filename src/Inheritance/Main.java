package Inheritance;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<StudentAssistant> StudentAssistantList = new ArrayList<>();

        String FamilyNameList[] = new String[10];
        String StudentNumberList[] = new String[10];
        int YearLevel[] = new int[10];
        int HoursRendered[] = new int[10];

        int n = in.nextInt();

        for(int i = 0; i < n; i++){
            int operation = in.nextInt();

            if(operation==1){
                if(StudentAssistantList.size()==10){
                    System.out.println("Sorry. Program is full.");
                }

                String firstName = in.next();
                String middleName = in.next();
                String lastName = in.next();
                int gen = in.nextInt();
                Gender gender = Gender.FEMALE;
                if(gen==1) {
                    gender = Gender.FEMALE;
                }
                if(gen==2) {
                    gender = Gender.MALE;
                }
                int age = in.nextInt();
                double height = in.nextDouble();
                double weight = in.nextDouble();
                String program = in.next();
                String studentNumber = in.next();
                int yearLevel = in.nextInt();
                int hoursRendered = in.nextInt();

                StudentAssistantList.add(new StudentAssistant(firstName, middleName, lastName, gender, age, height, weight, program, studentNumber, yearLevel, hoursRendered));

                for(int a = 0; a<StudentNumberList.length; a++) {
                    if(StudentNumberList[a]==null) {
                        StudentNumberList[a] = studentNumber;
                        break;
                    }
                }

                for(int b = 0; b<FamilyNameList.length; b++) {
                    if(FamilyNameList[b]==null) {
                        FamilyNameList[b] = lastName;
                        break;
                    }
                }

                for(int c = 0; c<YearLevel.length; c++) {
                    if(YearLevel[c]==0) {
                        YearLevel[c] = yearLevel;
                        break;
                    }
                }

                for(int d = 0; d<HoursRendered.length; d++) {
                    if(HoursRendered[d]==0) {
                        HoursRendered[d] = hoursRendered;
                        break;
                    }
                }


            }
            if(operation==2){
                String StudentNumber = in.next();
                int count = 0;
                for(int a = 0; a<StudentAssistantList.size(); a++) {
                    if (StudentNumber.equals(StudentNumberList[a])) {
                        StudentAssistantList.remove(a);

                    }
                }

                for (int b = 0; b < StudentAssistantList.size(); b++) {
                    if(!StudentNumber.equals(StudentNumberList[b])){
                        count++;
                        if(count==10) {
                            System.out.println("Student Assistant not found.");
                            break;
                        }
                        if(count==StudentAssistantList.size()) {
                            System.out.println("Student Assistant not found.");
                        }

                    }
                }

            }
            if(operation==3) {
                for (StudentAssistant student : StudentAssistantList) {
                    System.out.println("Name: "+student.firstName + " " + student.middleName + " " + student.lastName + "\nGender: " + student.gender + "\nAge: " + student.age + "\nHeight: " + student.height + "\nWeight: " + student.weight + "\nProgram: " + student.program + "\nStudent Number: " + student.studentNumber + "\nYear Level: " + student.yearLevel + "\nHours rendered: " + student.hoursRendered);

                }

            }
            if (operation == 4) {
                    String familyName = in.next();
                    int count =0;
                    for (int a = 0; a < StudentAssistantList.size(); a++) {
                        if (familyName.equals(FamilyNameList[a])) {
                            StudentAssistant student = StudentAssistantList.get(a);
                            System.out.println("Name: "+student.firstName + " " + student.middleName + " " + student.lastName + "\nGender: " + student.gender + "\nAge: " + student.age + "\nHeight: " + student.height + "\nWeight: " + student.weight + "\nProgram: " + student.program + "\nStudent Number: " + student.studentNumber + "\nYear Level: " + student.yearLevel + "\nHours rendered: " + student.hoursRendered);

                        }
                    }
                   for (int b = 0; b < StudentAssistantList.size(); b++) {
                        if(!familyName.equals(FamilyNameList[b])){
                            count++;
                            if(count==10) {
                                System.out.println("Student Assistant not found.");
                                break;
                            }
                            if(count==StudentAssistantList.size()) {
                                System.out.println("Student Assistant not found.");
                            }
                        }
                    }

            }
            if (operation == 5) {
                int yearlevel = in.nextInt();
                int count = 0;
                for (int b = 0; b < StudentAssistantList.size(); b++) {
                    if (yearlevel==YearLevel[b]) {
                        StudentAssistant student = StudentAssistantList.get(b);
                        System.out.println("Name: "+student.firstName + " " + student.middleName + " " + student.lastName + "\nGender: " + student.gender + "\nAge: " + student.age + "\nHeight: " + student.height + "\nWeight: " + student.weight + "\nProgram: " + student.program + "\nStudent Number: " + student.studentNumber + "\nYear Level: " + student.yearLevel + "\nHours rendered: " + student.hoursRendered);
                    }

                }
                for (int b = 0; b < StudentAssistantList.size(); b++) {
                    if(yearlevel!=YearLevel[b]){
                        count++;
                        if(count==10) {
                            System.out.println("Student Assistant not found.");
                            break;
                        }
                        if(count==StudentAssistantList.size()) {
                            System.out.println("Student Assistant not found.");
                        }
                    }
                }

            }
            if (operation == 6) {
                int count = 0;
                for (int c = 0; c<StudentAssistantList.size(); c++) {
                    if(HoursRendered[c]>0 && HoursRendered[c]<40) {
                        StudentAssistant student = StudentAssistantList.get(c);
                        System.out.println("Name: "+student.firstName + " " + student.middleName + " " + student.lastName + "\nGender: " + student.gender + "\nAge: " + student.age + "\nHeight: " + student.height + "\nWeight: " + student.weight + "\nProgram: " + student.program + "\nStudent Number: " + student.studentNumber + "\nYear Level: " + student.yearLevel + "\nHours rendered: " + student.hoursRendered);
                    }
                }
                for (int d = 0; d < StudentAssistantList.size(); d++) {
                    if(HoursRendered[d]>=40){
                        count++;
                        if(count==10) {
                            System.out.println("Student Assistant not found.");
                            break;
                        }
                        if(count==StudentAssistantList.size()) {
                            System.out.println("Student Assistant not found.");
                        }
                    }
                }
            }
        }

    }
}
