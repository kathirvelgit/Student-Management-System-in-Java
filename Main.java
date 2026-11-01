class Student {
    private int studentId;
    private String studentName;
    private int age;
    private String course;

    Student() {
        studentId = 0;
        studentName = "Unknown";
        age = 0;
        course = "Not Mentioned";
    }

    Student(int studentId, String studentName, int age, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.course = course;
    }

    int getstudentId() {
        return studentId;
    }

    String getstudentName() {
        return studentName;
    }

    int getage() {
        return age;
    }

    String getcourse() {
        return course;
    }

    void setstudentId(int id) {
        studentId = id;

    }

    void setstudentName(String name) {
        studentName = name;
    }

    void setage(int ag) {
        age = ag;
    }

    void setcourse(String cour) {
        course = cour;
    }

    void displayDetails() {
        System.out.println("Student ID: " + getstudentId());
        System.out.println("Name: " + getstudentName());
        System.out.println("Age: " + getage());
        System.out.println("Course: " + getcourse());
    }
}

public class Main {
    public static void main(String[] args) {

        // Default Constructor
        Student obj1 = new Student();

        obj1.setstudentId(101);
        obj1.setstudentName("Kathir");
        obj1.setage(25);
        obj1.setcourse("Java Full Stack");

        // parameterized constructor
        Student obj2 = new Student(102, "Priya", 23, "Python Full Stack");

        System.out.println("Student 1");
        obj1.displayDetails();

        System.out.println("\nStudent 2");
        obj2.displayDetails();

    }
}