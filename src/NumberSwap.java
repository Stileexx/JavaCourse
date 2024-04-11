public class NumberSwap {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int temporary = a;

        a = b;
        b = temporary;

        System.out.println(a + " " + b);

    }
}
