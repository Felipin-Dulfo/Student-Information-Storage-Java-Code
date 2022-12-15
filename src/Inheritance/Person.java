package Inheritance;

public class Person {
    protected String firstName;
    protected String middleName;
    protected String lastName;
    protected Gender gender;
    protected int age;
    protected double height; // cm
    protected double weight; // kg

    public Person() {
        System.out.println("Inside constructor of Person.");
        firstName = "Ambongan";
        middleName = "Adlawon";
        lastName = "Gatus";
        gender = Gender.MALE;
        age = 0;
        height = 50;
        weight = 6;
    }

    public Person(
            String firstName,
            String middleName,
            String lastName,
            Gender gender,
            int age,
            double height,
            double weight
    ) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void display() {
        System.out.printf("Name: %s %s %s\n", firstName, middleName, lastName);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
