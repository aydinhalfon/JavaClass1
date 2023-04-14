package class4;

import java.util.Scanner;

public class E11Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /*If we want to take a complete line from the user we should use
        nextLine method (Put anything other than string ==Error input mismatch
         */
        String sentence=scanner.nextLine();
        System.out.println(sentence);


    }
}
