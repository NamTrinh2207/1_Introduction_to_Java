import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String numberInput = sc.nextLine();

        String M = "một";
        String H = "hai";
        String B = "ba";
        String B1 = "bốn";
        String N = "năm";
        String S = "sáu";
        String B2 = "bảy";
        String T = "tám";
        String C = "chín";
        String K = "không";

        String arrNumberDefault[] = new String[]{K, M, H, B, B1, N, S, B2, T, C};

        String arrNumberInput[] = numberInput.split("");

        String resultOne = "";
        String resultTwo = "";
        String resultThree = "";


        for (int i = 0; i < arrNumberDefault.length; i++) {
            if (arrNumberInput[0].equals(i + "")) {
                resultOne = arrNumberDefault[i];

            }
            if (arrNumberInput.length == 2) {
                if (arrNumberInput[1].equals(i + "")) {
                    resultTwo = arrNumberDefault[i] + "";

                }
            }
            if (arrNumberInput.length == 3) {
                if (arrNumberInput[2].equals(i + "")) {
                    resultThree = arrNumberDefault[i] + "";

                }
            }
        }
        if (arrNumberInput.length == 1) {
            System.out.println(resultOne);
        }

        if (arrNumberInput.length == 2) {

            if (resultOne.equals("một") && resultTwo.equals("không")) {
                System.out.print(" mười ");

            } else if (resultOne == "một" && resultTwo != "không") {
                System.out.print(" mười " + resultTwo);

            } else if (resultTwo.equals("không")) {
                System.out.print(resultOne + " mươi ");
            } else {
                System.out.print(resultOne + " mươi " + resultTwo);
            }
        }

        if (arrNumberInput.length == 3) {

            if (resultThree == "không") {
                System.out.print(resultOne + "trăm" + resultTwo + "mươi");
            } else {
                System.out.print(resultOne + "trăm" + resultTwo + "mươi" + resultThree);
            }
        }


    }
}
