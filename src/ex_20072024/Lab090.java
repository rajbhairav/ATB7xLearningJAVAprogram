package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

        // Grade calculator prg

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score!!");
        int score = sc.nextInt();

        char grade = 'F';

        if (score >= 90 && score <= 100){
            grade = 'A';
        }
        else if(score >=80 && score <=89) {
            grade = 'B';
        }
        else if(score >=70 && score <=79) {
            grade = 'c';
        }
        else if(score >=60 && score <=69) {
            grade = 'D';
        }
        else if(score <=0 || score > 100) {
            System.out.println("LOL!!, are you GOD?");
            grade = 'O';
        }else{
            grade ='F';
        }
        System.out.println("Your Grade is ->"+ grade);
        sc.close();

    }
}
