package methods;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        // System.out.println(isPrime(num));
        System.out.println(isArmStrong(num));
    }
 
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isArmStrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digit;
        while (num!= 0) {
            digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        return originalNum == sum;
    }

}
