import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 0 nếu muốn đổi từ VND -> USD");
        System.out.println("Nhập vào 1 nếu muốn đổi từ  USD -> VNĐ");
        System.out.print("Nhập vào loại tiền muốn quy đổi USD/VNĐ : ");
        int Type = scanner.nextInt();

        if (Type == 1) {
            System.out.println("Nhập vào số tiền USD");
            int USD = scanner.nextInt();
            int VND = USD * 23000;
            System.out.println(USD + " $ = " + VND + " VND");
        } else if (Type == 0) {
            System.out.println("Nhập vào số tiền VND");
            double VND = scanner.nextInt();
            double USD = VND / 23000;
            System.out.println(VND + "VND = " + USD + " $");
        }else {
            System.out.println("Vui lòng nhập lại dữ liệu");
        }
    }
}