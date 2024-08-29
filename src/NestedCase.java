import java.util.Scanner;

public class NestedCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employerID = input.nextInt();
        String department = input.next();


        switch (employerID) {
            case 1:
                System.out.println("Steven Utcke");
                break;
            case 2:
                System.out.println("Slawa Suppes");
                break;
            case 3:
                System.out.println("Nick Stettnisch");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Not a valid department!");
                }
                break;
            default:
                System.out.println("Not a valid Employed ID!");
        }

        //better way to write:

        switch (employerID) {
            case 1 -> System.out.println("Steven Utcke");
            case 2 -> System.out.println("Slawa Suppes");
            case 3 -> {
                System.out.println("Nick Stettnisch");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Not a valid department!");
                }
            }
            default -> System.out.println("Not a valid Employed ID!");
        }
    }
}