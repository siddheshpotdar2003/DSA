package ConditionalsAndLoops;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "Apple":
                System.out.println("Red Sweet fruit");
                break;
            case "Orange":
                System.out.println("Orange Citurus fruit");
                break;
            case "Grapes":
                System.out.println("small green fruit");
                break;
            case "Watermelon":
                System.out.println("Big green fruit");
                break;
            default:
                System.out.println("Enter a valid fruit");
        }

    }
}