import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Firts Number: ");
        double a = input.nextDouble();

        System.out.println("Enter your second number: ");
        double b = input.nextDouble();

        double result = a + b;

        System.out.println("The sum is: "  + result);


    }
}
