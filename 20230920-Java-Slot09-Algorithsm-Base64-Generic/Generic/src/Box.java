public class Box<T> {
    private T content;

    public Box() {
        // Khởi tạo hộp mà chưa có nội dung
        this.content = null;
    }

    public void put(T item) {
        // Đặt đối tượng vào hộp
        this.content = item;
    }

    public T get() {
        // Trả về đối tượng trong hộp
        return this.content;
    }

    public static void main(String[] args) {
        // Tạo hộp kiểu Integer và đặt giá trị vào
        Box<Integer> integerBox = new Box<>();
        integerBox.put(42);

        // Lấy giá trị ra khỏi hộp
        Integer intValue = integerBox.get();
        System.out.println("Giá trị của hộp Integer là: " + intValue);

        // Tạo hộp kiểu String và đặt giá trị vào
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello, Generics!");

        // Lấy giá trị ra khỏi hộp
        String stringValue = stringBox.get();
        System.out.println("Giá trị của hộp String là: " + stringValue);
    }
}
