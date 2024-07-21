package ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        // take a user input as char and tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell the user is it is a vowel");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input) {
            case 'a' :
                System.out.println("Vowel");
                break;

            case 'e' :
                System.out.println("Vowel");
                break;

            case 'i':
                System.out.println("Vowel");
                break;

            case 'o':
                System.out.println("Vowel");
                break;

            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");




        }


        switch (user_input) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }
}
