package class3;

import java.util.Scanner;

public class OwnExperimentsByAydın {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println(name);
        System.out.println("What's your age?");
        int age = scan.nextInt();
        System.out.println("Thank you for your input" + " " + name);

        if (age>18) {
            System.out.println("Welcome to Facebook!");
        } else{
            System.out.println("Oops. Looks like you're not quite there yet, please come back when you're over 18");}

    }
}