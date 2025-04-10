package methods;

public class Main {
    public static void main(String[] args) {
        // int sum = sum(23,3);
        // System.out.println(sum);

        String greeting = greeting("doraemon");
        System.out.println(greeting);
    }

    static String greeting(String name) {
        String greeting = "Hello "  + name;    
        return greeting;
    }

    static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
