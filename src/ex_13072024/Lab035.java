package ex_13072024;

public class Lab035 {
    public static void main(String[] args) {
        // Escape Chars
        char c = '\n'; // new line /next line
        char c1 = '\t'; // Add tab
        char c2 = '\b'; // Backlash, delete 1 char
        char c3 = '\r'; // Bcklash, delete 1 word
        System.out.println("Yogesh"+c+"Raj");
        System.out.println("Yogesh"+c1+"Raj");
        System.out.println("Yogesh  "+c2+"Raj");
        System.out.println("Yogesh"+c3+"Raj");
    }
}
