package class13;

public class Task1 {
    public static void main(String[] args) {
        // Create a string that will hold a sentence.
        //Write a program to get a new String without any spaces

        String str=new String("I have a class today");
        System.out.println(str.replaceAll(" ",""));
    }
}
