class Student extends Person {
    private double gpa;

    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return this.gpa;
    }

    @Override
    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Address: " + this.getAddress());
        System.out.println("GPA: " + this.getGpa());
    }
}