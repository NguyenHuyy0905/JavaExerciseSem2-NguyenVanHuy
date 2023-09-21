import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        // Tạo một danh sách generic để lưu trữ các số nguyên
        List<Integer> integerList = new ArrayList<>();

        // Thêm các số nguyên vào danh sách
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        // Lặp qua danh sách và in ra các số nguyên
        for (Integer num : integerList) {
            System.out.println(num);
        }

        // Tạo một danh sách generic để lưu trữ các chuỗi
        List<String> stringList = new ArrayList<>();

        // Thêm các chuỗi vào danh sách
        stringList.add("Hello");
        stringList.add("World");

        // Lặp qua danh sách và in ra các chuỗi
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}
