package exception_stringtoolong;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập các chuỗi ký tự (nhập 'DONE' để kết thúc):");

        while (true) {
            try {
                // Nhập chuỗi từ người dùng
                System.out.print("Nhập chuỗi: ");
                String input = scanner.nextLine();

                // Nếu người dùng nhập "DONE", thoát khỏi vòng lặp
                if (input.equalsIgnoreCase("DONE")) {
                    System.out.println("Kết thúc chương trình.");
                    break;
                }

                // Kiểm tra độ dài chuỗi
                if (input.length() > 30) {
                    throw new StringTooLongException("Chuỗi nhập quá 30 ký tự: \"" + input + "\"");
                }

                // Nếu hợp lệ, in chuỗi ra
                System.out.println("Chuỗi hợp lệ: " + input);
            } catch (StringTooLongException e) {
                // Xử lý ngoại lệ khi chuỗi quá dài
                System.out.println("Lỗi: " + e.getMessage());
                System.out.println("Chuong trinh ket thuc !");
                break;
            }
        }

        scanner.close();
    }
}
