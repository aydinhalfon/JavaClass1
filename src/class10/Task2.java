package class10;

public class Task2 {
    public static void main(String[] args) {

        /*
        Create an array of names and store all names of your group. Then print your name from that array.
         (use 2 different ways of creating an array).
         */

        String [] names = {"Aydın", "Mehmet", "Ali"};
        System.out.println(names[0]);

        String [] names2 = new String[3];
        names2 [0]="Aydın";
        names2 [1]="Mehmet";
        names2 [2]="Ali";
        System.out.println(names2[0]);



    }
}
