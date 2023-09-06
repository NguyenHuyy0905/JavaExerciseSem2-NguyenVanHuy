class Teacher extends Person {
    private int salary;

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Salary: " + this.getSalary());
    }
}