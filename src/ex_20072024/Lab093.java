package ex_20072024;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // Chrome -> start chrome, firefox, edge, -> execution edge

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!, where you want to execute the program");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName){
            case "chrome":
                System.out.println("Starting the chrome browser");
                // further code to start the chrome
                // webdriver driver = new Chrome(); // Selenium code
                break;

            case "firefox":
                System.out.println("Starting the firefox browser");
                // further code to start the chrome
                // webdriver driver = new Chrome(); // Selenium code
                break;

            case "edge":
                System.out.println("Starting the edge browser");
                break;

            default:
                System.out.println("I have no idea which browser is this");
                break;

        }


    }
}
