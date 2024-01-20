package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Super app!");
        System.out.println("Calculator for base calculations");
        int a = 10;
        int b = 4;
        int c = add(a, b);
        System.out.format("%d + %d = %d", a, b, c);
    }

    private static int add(int a, int b){
        return a + b;
    }
}
