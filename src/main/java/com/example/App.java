package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Agile Calculator System ---");
        App calc = new App();
        System.out.println("Addition (10 + 5): " + calc.add(10, 5));
    }

    // Simple Addition Method
    public int add(int a, int b) {
        return a + b;
    }

    // Simple Subtraction Method
    public int subtract(int a, int b) {
        return a - b;
    }
}
