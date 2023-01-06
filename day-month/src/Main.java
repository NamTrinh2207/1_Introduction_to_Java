import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bạn muốn đếm ngày của tháng nào ?");
        int month = sc.nextInt();
        String dayInMonth;
        switch (month) {
            case 2:
                dayInMonth = " có 28 hoặc 29 ngày";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayInMonth = " có 31 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayInMonth = "có 30 ngày";
                break;
            default:
                dayInMonth = "";
                break;
        }
        if (!dayInMonth.equals("")) {
            System.out.println("Tháng " + month + dayInMonth);
        } else {
            System.out.println("không hợp lệ");
        }
    }
}