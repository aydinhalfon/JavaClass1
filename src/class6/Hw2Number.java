package class6;

import java.util.Scanner;

public class Hw2Number {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1-1000");
        int number = scanner.nextInt();
        if (number <= 10&& number>=1) {
            System.out.println("Small");
        } else if (number <= 100 && number>=11) {
            System.out.println("Medium");

        } else if (number>=101 && number<=1000){
            System.out.println("Large");
        }


    }
}
