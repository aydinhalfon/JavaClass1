package class9;

public class E3Arrays {
    public static void main(String[] args) {

        double [] numbers = {10.5, 5.5, 0.05, 100.5, 586};
        int i=0;
       /* System.out.println(numbers[i]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        */

        // below is an example of using a for loop with an Array
        System.out.println(numbers.length);
        /* for (int j = 0; j <=4 ; j++) {
            System.out.println(numbers[j]);
            here you have to manually count the number of indexes
            below code with length will automatically count
            so we can keep on adding

        } */

        for (int j = 0; j < numbers.length ; j++) {
            System.out.println(numbers[j]);
        }




    }
}
