import java.util.Scanner;

public class TemperaturConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your temperature in C pls");
        float tempInC = input.nextFloat();

        float tempInF = (tempInC * 9 / 5) + 32;
//        System.out.println("Your temperature is: " + tempInF + "°F");
        System.out.println(tempInF);
    }
}
