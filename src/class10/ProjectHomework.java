package class10;

public class ProjectHomework {
    public static void main(String[] args) {
        /*
         1 Create an array of names and store all names of your group. Then print your name from that array.
         (use 2 different ways of creating an array).

         2 Create an array of chars and store grades into it: A,B,C,D. Then print a grade B (use 2 different ways of creating an array).
         3 Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding day”.

         4 Create an array of cars and store 6 elements into it. Using 2 different loops print all values from the array.

         5 Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.

         6 Create an array on integers and calculate the sum of all elements in an array

         7 From an array of integer elements find the largest number.

         8 Create an array to store char values and then print those in reverse order
         */


        //1 Create an array of names and store all names of your group. Then print your name from that array.
        //  (use 2 different ways of creating an array).

        String[] names = {"Aydın", "Mehmet", "Ali"};
        System.out.println(names[0]);

        String[] names2 = new String[3];
        names2[0] = "Aydın";
        names2[1] = "Mehmet";
        names2[2] = "Ali";
        System.out.println(names2[0]);

        //2  Create an array of chars and store grades into it: A,B,C,D. Then print a grade B (use 2 different ways of creating an array).

        char[] chars = {'A', 'B', 'C', 'D'};
        System.out.println(chars[1]);

        char[] chars1 = new char[4];
        chars1[0] = 'A';
        chars1[1] = 'B';
        chars1[2] = 'C';
        chars1[3] = 'D';
        System.out.println(chars1[1]);

        //3 Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using elements of array: “Saturday is Java coding day”.
        String[] Javaworkday = {"Java", "Saturday", "day", "coding", "is"};
        System.out.println(Javaworkday[1] + " " + Javaworkday[4] + " " + Javaworkday[0] + " " + Javaworkday[3] + " " + Javaworkday[2]);
        System.out.println();


        //4 is the same with 5


        //5 Create an array of animals and store 5 elements into it. Using 2 different loops print all elements from the array.
        String[] first = {"Dog", "Cat", "Mouse", "Bird", "Elephant", "Owl"};
        for (String s : first) {
            System.out.print(s + " ");

        }
        System.out.println();

        String[] second = new String[6];
        second[0] = "Elephant";
        second[1] = "Tiger";
        second[2] = "Crocodile";
        second[3] = "Bear";
        second[4] = "Horse";
        second[5] = "Frog";


        int firstint = 0;
        while (firstint <= second.length - 1) {
            System.out.print(second[firstint] + " ");
            firstint++;

        }

        System.out.println();
        //6 Create an array on integers and calculate the sum of all elements in an array
        int sum = 0;
        int[] numbers = {5, 10, 15, 25, 35, 45};
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        System.out.println();

        //7 From an array of integer elements find the largest number.


        int[] numeros = {80, 43, 65, 98, 548, 645};
        int largest = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > largest) {
                largest = numeros[i];
            }

        }
        System.out.println("The largest number is" + " " + largest);
        System.out.println();

        //8 Create an array to store char values and then print those in reverse order

        char[] chars3 = {'Q', 'R', 'D', 'K'};
        for (int i = 3; i >= 0; i--) {
            System.out.print(chars3[i] + " ");

        }


    }
}
