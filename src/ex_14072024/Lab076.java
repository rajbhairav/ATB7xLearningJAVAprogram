package ex_14072024;

public class Lab076 {
    public static void main(String[] args) {
        String s1 = "Yogesh";
        // String s1 = "Y o g e s h";
        // count =     |0|1|2|3|4|5|

        char c = s1.charAt(3);
        System.out.println(c);
        s1 = s1.concat("\tRaj"); // Yogesh Raj
        System.out.println(s1);

    }
}
