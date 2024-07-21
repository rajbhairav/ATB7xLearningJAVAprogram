package ex_20072024;

public class Lab098 {
    public static void main(String[] args) {
        // JDK > 13

        int itemcode = 003;
        switch (itemcode){
            case 001 -> System.out.println("It is a Laptop!");
            case 002 -> System.out.println("It is a Desktop!");
            case 003 -> System.out.println("It is a Mobile phone!");
            default -> System.out.println("Hello!");

        }
    }
}
