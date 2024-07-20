package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take user input and check if number id even or odd.


        // Logic Building - Ready
        // 1. figure out the input &  2. Data type
        // int
        // How to take input in the Java? - Scanner class -
        // nextInt() -> input

        // 3. Do we need conversion or directly
        // 4. Rough logic
        // 5. optimize

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        if(user_input%2==0) {
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }



    }
}
