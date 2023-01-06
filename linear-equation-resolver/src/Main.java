import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Cho phương trình bậc nhất 'a * x + b = c'");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập vào a : ");
        double a = sc.nextDouble();

        System.out.print("Nhập vào b : ");
        double b = sc.nextDouble();

        System.out.print("Nhập vào c : ");
        double c = sc.nextDouble();

        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Phương trình có 1 nghiệm x = " + x);
        } else {
            if (b == c) {
                System.out.println("phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}