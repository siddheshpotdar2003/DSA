package methods;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 100;
        System.out.println(x);
        System.out.println(x);
        fun();
    }

    static void fun(){
        System.out.println(x);
    }
    
}
