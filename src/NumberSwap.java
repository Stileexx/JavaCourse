public class NumberSwap {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;


//        number swap
//        int temporary = a;
//        a = b;
//        b = temporary;

        swap(a, b);
        System.out.println(a + " " + b);

        String name = "Samir Abdul";
        changeName(name);
        System.out.println(name);

    }

     static void changeName(String name) {
        name = "Gaber Asd";
    }

    static void swap(int a, int b) {
        int temporary = a;
        a = b;
        b = temporary;
    }
}
