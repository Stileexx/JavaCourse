import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Take input from user till user does not press x or X
        int result = 0;
        while (true) {
//            take operator as input
            System.out.println("Enter your operator: ");
            char operator = input.next().trim().charAt(0);
            System.out.println();
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
//                input two numers
                int number2 = input.nextInt();

                if (operator == '+') {
                    result = number1 + number2;
                }
                if (operator == '-') {
                    result = number1 - number2;
                }
                if (operator == '*') {
                    result = number1 * number2;
                }
                if (operator == '/') {
                    if (number2 != 0) {
                        result = number1 / number2;
                    }
                }
                if (operator == '%') {
                    result = number1 % number2;
                }

            } else if (operator == 'x' ||operator == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!");
            }
            System.out.println(result);
        }

    }
}
