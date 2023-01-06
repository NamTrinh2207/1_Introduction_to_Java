import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bmi, weight, height;

        System.out.print("Nhập vào cân nặng : ");
        weight = scanner.nextDouble();

        System.out.print("Nhập vào chiều cao : ");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);

        if (bmi < 18) {
            System.out.println("Chỉ số bmi = " + bmi + " thiếu cân");
        } else if (bmi < 25.0) {
            System.out.println("Chỉ số bmi = " + bmi + " bình thường");
        } else if (bmi < 30.0) {
            System.out.println("chỉ số bmi = " + bmi + " thừa cân");
        } else {
            System.out.println("chỉ số bmi = " + bmi + " béo phì");
        }
    }
}