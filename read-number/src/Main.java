// chuyển số thành chữ với 3 chữ số

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        String numberInput = input.nextLine();

        String[] arrNumberDefault = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        String[] arrNumberInput = numberInput.split("");

        String indexOne = "";
        String indexTwo = "";
        String indexThree = "";

        for (int i = 0; i < arrNumberDefault.length; i++) {
            if (arrNumberInput[0].equals(i + "")) {
                indexOne = arrNumberDefault[i];
            }

            if (arrNumberInput.length == 2) {
                if (arrNumberInput[0].equals(i + "")) {
                    indexOne = arrNumberDefault[i];
                }
                if (arrNumberInput[1].equals(i + "")) {
                    indexTwo = arrNumberDefault[i] + "";
                }
            }

            if (arrNumberInput.length == 3) {
                if (arrNumberInput[0].equals(i + "")) {
                    indexOne = arrNumberDefault[i];
                }
                if (arrNumberInput[1].equals(i + "")) {
                    indexTwo = arrNumberDefault[i] + "";
                }
                if (arrNumberInput[2].equals(i + "")) {
                    indexThree = arrNumberDefault[i] + "";
                }
            }
        }
        if (arrNumberInput.length == 1) {
            System.out.println(indexOne);
        }

        if (arrNumberInput.length == 2) {
            if (indexOne.equals("một") && indexTwo.equals("không")) {
                System.out.print(" mười ");
            } else if (indexOne.equals("một")) {
                System.out.print(" mười " + indexTwo);
            } else if (indexTwo.equals("năm")) {
                System.out.println(indexOne + " mươi lăm ");
            } else if (indexTwo.equals("không")) {
                System.out.print(indexOne + " mươi ");
            } else if (indexTwo.equals("một")) {
                System.out.println(indexOne + " mươi mốt ");
            } else {
                System.out.print(indexOne + " mươi " + indexTwo);
            }
        }

        if (arrNumberInput.length == 3) {
            if (indexTwo.equals("không") && indexThree.equals("không")) {
                System.out.println(indexOne + " trăm ");
            } else if (indexTwo.equals("không")) {
                System.out.println(indexOne + " trăm lẻ " + indexThree);
            } else if (indexTwo.equals("một") && indexThree.equals("không")) {
                System.out.println(indexOne + " trăm mười");
            } else if (indexTwo.equals("một")) {
                System.out.println(indexOne + " trăm mười " + indexThree);
            } else if (indexThree.equals("không")) {
                System.out.println(indexOne + " trăm " + indexTwo + " mươi");
            } else if (indexThree.equals("một")) {
                System.out.println(indexOne + " trăm " + indexTwo + " mươi mốt ");
            } else if (indexThree.equals("năm")) {
                System.out.println(indexOne + " trăm " + indexTwo + " mươi lăm ");
            } else {
                System.out.println(indexOne + " trăm " + indexTwo + " mươi " + indexThree);
            }
        }
    }
}
