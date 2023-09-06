class Person{
    private String name;
    private int dob;
    public Person(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }
    public String getName() {
        return this.name;
    }

    public int getDob() {
        return this.dob;
    }
}

class Student extends Person {
    private double gpa;

    public Student(String name, int dob, double gpa) {
        super(name, dob);
        this.gpa = gpa;
    }

    public double getGpa() {
        return this.gpa = gpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Hai", 1999, 8.8);
        System.out.println("Name: " + s.getName());
        System.out.println("Date of birth: " + s.getDob());
        System.out.println("GPA: " + s.getGpa());
    }
}