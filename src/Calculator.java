import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Take input from user till user does not press x or X
        int result = 0;
        while (true) {
//            take operator as input
            char operator = input.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
//                input two numers
                int number1 = input.nextInt();
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

            }
        }
        System.out.println(result);
    }
}
