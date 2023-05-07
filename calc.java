import java.io.IOException;

import java.util.Scanner;
public class calc {

    public static void main(String[] args) throws IOException {
        int number1;
        int number2;
        int otvet;
        int number3;
        char ss;
        Scanner scanner = new Scanner(System.in);
        System.out.print("!через пробелы! введите 1 цифру, оп и 2 цифру: ");


        number1 = scanner.nextInt();

        ss = scanner.next().charAt(0);
        number2 = scanner.nextInt();


        switch (ss) {
            case '+':
                otvet = number1 + number2;
                break;
            case '-':
                otvet = number1 - number2;
                break;
            case '*':
                otvet = number1 * number2;
                break;
            case '/':
                otvet = number1 / number2;
                break;
            default:
                throw new IOException();
        }
        if (number1 == 0) {
            throw new IOException();
        }
        if (number2 == 0) {
            throw new IOException();
        }
        if (number1 < 0) {
            throw new IOException();


        }
        if (number1 > 10) {
            throw new IOException();

        }
        if (number2 < 0) {
            throw new IOException();
        }
        if (number2 > 10) {
            throw new IOException();
        }
        System.out.printf(number1 + " " + ss + " " + number2 + " = " + otvet);


    }
}








