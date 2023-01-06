import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào năm : ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }
        } else {
            isLeapYear = true;
        }
        if (isLeapYear){
            System.out.println(year+" là năm nhuận");
        }else {
            System.out.println(year+" là năm không nhuận");
        }
    }
}