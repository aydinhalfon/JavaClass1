package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        // to print all the numbers from starting point to ending point
        // ask the user for starting and ending counter

        Scanner scan=new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter the starting and the ending point and the gap");
        int start=scan.nextInt();
        int end=scan.nextInt();
        int gap= scan.nextInt();
        int counter=start;
        while(counter<=end){
            System.out.print(counter+" ");
            counter++; //=counter+gap; //counter+=gap;

        }









    }
}
