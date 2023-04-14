package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=scan.nextInt();

        if (age<18){
            System.out.println("You can't drive");
        }else{
            System.out.println("You can drive");
        }


        /*
        ask the user for their age and based on their age write an if else condition.
        If age is less than 18 we have to print print you can't dirve
         */
    }
}
