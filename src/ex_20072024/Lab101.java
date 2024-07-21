package ex_20072024;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        // write a program name, age, salary - print it

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name = sc.next();

        System.out.println("Enter your Age");
        int Age = sc.nextInt();

        System.out.println("Enter your Salary");
        double Salary = sc.nextDouble();

        System.out.println("Your Name is " + Name);
        System.out.println("Your Age is " + Age);
        System.out.println("Your Salary is " + Salary);

        sc.close();



    }
}
