package methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(10, 12);
        fun("foo", "bar", "baz");
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    
    static void fun(String ...s) {
        System.out.println(Arrays.toString(s));
    }
}
