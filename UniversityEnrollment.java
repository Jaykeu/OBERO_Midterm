// The Given base Class of this Code
class Person {
    // The Fields that is given to us
    protected String name;
    protected int age;

    //Constructor that will initiallize the name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Methods that will explain the person's information
    public void displayInfo() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
    }

}
// Subclass of the Student inheriting from a Person
class Student extends Person {
    // Fields for student-specific information
    private String studentID;
    private String course;
    private int units;
    private final int feePerUnit = 1000; // Constant for fee per unit

    // Constructor that will initialize of all the fields
    public Student(String name, int age, String studentID, String course, int units) {
        super(name, age); // Calling the superclass constructor
        this.studentID = studentID;
        this.course = course;
        this.units = units;
    }

    // Method to calculate the total fees based on the number of units
    public double calculateFees() {
        return units * feePerUnit;
    }

    // Override displayInfo() to include student-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the base class method to display name and age
        System.out.println("Student ID: " + studentID);
        System.out.println("Course: " + course);
        System.out.println("Units: " + units);
        System.out.println("Total Fees: $" + calculateFees());
    }
}

// Subclass Instructor inheriting from Person
class Instructor extends Person {
    // Fields for instructor-specific information
    private String employeeID;
    private String department;
    private double salary;

    // Constructor to initialize all fields
    public Instructor(String name, int age, String employeeID, String department, double salary) {
        super(name, age); // Calling the superclass constructor
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Override displayInfo() to include instructor-specific details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Calling the base class method to display name and age
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to test the functionality
public class UniversityEnrollment {
    // Method to demonstrate polymorphism
    public static void printDetails(Person p) {
        p.displayInfo(); // Calls the appropriate displayInfo() based on the object's type
        System.out.println(); // Adds a blank line for better readability
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Creating two Student objects
        Student student1 = new Student("Jay", 19, "231003526", "Computer Engineering", 8);
        Student student2 = new Student("Nicole", 20, "231000329", "Computer Engineering", 8);

        // Creating two Instructor objects
        Instructor instructor1 = new Instructor("Engr. Jovillano", 22, "CPE 211", "Engineering", 100000.0);
        Instructor instructor2 = new Instructor("Engr. Caning", 25, "EM 213", "Engineering", 100000.0);

        // Using the printDetails() method to print information for each person
        printDetails(student1);
        printDetails(student2);
        printDetails(instructor1);
        printDetails(instructor2);
    }
}
