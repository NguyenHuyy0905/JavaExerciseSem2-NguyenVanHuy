class Customer extends Person {
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer name: " + this.getName());
        System.out.println("Customer address: " + this.getAddress());
        System.out.println("Customer balance: " + balance);
    }
}