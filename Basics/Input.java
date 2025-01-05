package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println(input.nextInt());
        // System.out.println(input.next());
        // System.out.println(input.nextLine());

        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println("Hello " + name + "!");
    }
}