import java.util.Base64;

public class Base64Example {
    public static void main(String[] args) {
        // Chuỗi cần mã hóa
        String originalString = "Hello, World!";

        // Mã hóa chuỗi thành Base64
        String encodedString = Base64.getEncoder().encodeToString(originalString.getBytes());
        System.out.println("Chuỗi đã mã hóa: " + encodedString);

        // Giải mã chuỗi từ Base64
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Chuỗi đã giải mã: " + decodedString);
    }
}

