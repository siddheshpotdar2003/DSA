package ConditionalsAndLoops;

import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        
        int i = 0;
        int j = 1;
        int count = 2;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(count < n) {
            int temp = i + j;
            i = j;
            j = temp;
        }

        if(n == 1) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }
    }
}