package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        send("Hello JAVA!");

        Product product = new Product("Mouse");
        System.out.println(product.getName());

        int a = 72;
        int b = 105;
        char c = '\u0041';

        System.out.println("" + (char) a + (char) b);
        System.out.println(c);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please input your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Please input your age: ");
//        int age = scanner.nextInt();
//        System.out.printf("Your name is %s, you age is %d\n", name, age);

        double pi = 0;
        for(int i = 1; i < 10; i+=2) {
            if ((i / 2) % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println(-i);
            }
        }

        int[] ns = {1,2,3,4,5};
        System.out.println(ns);
        System.out.println(Arrays.toString(ns));


    }

    private static void send(String message) {
        System.out.println(message);
    }
}
