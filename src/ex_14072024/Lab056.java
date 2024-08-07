package ex_14072024;

public class Lab056 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit (with data type) - loss

        // Widening
        byte b = 10;
        int a=b; // VALID - Implicit casting - JVM
        int a1 = (int)b; // VALID - Explicit casting - manually
        System.out.println(a1);

        // Narrowing
        int val = 300;
        // byte b1 = val; // Invalid - implicit casting - JVM
        byte b1 = (byte)val; // Invalid Explicit casting- // loss of data
        System.out.println(b1);

    }
}
