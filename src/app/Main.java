package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Calculator for base calculations");
        System.out.println("Version 1.0");
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
