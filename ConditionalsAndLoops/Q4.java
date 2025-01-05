package ConditionalsAndLoops;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = sc.nextInt();

        int rem;
        int count = 0;

        while(num > 0) {
            rem = num % 10;
            num /= 10;
            if(rem == k) {
                count++;
            }
        }

        System.out.println(count);
    }
}