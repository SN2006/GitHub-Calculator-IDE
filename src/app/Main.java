package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My app for users.");
        System.out.println("The informative application.");
        int a = 10;
        int b = 4;
        int c = add(a, b);
        System.out.format("%d + %d = %d\n", a, b, c);
        int d = multiply(a, b);
        System.out.format("%d * %d = %d", a, b, d);
    }

    private static int add(int a, int b){
        return a + b;
    }

    private static int multiply(int a, int b){
        return a * b;
    }
}
