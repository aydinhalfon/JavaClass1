package class9;

public class E11Arrays {
    public static void main(String[] args) {
        /*

        1st way: int [] numbers = {1,2,3,4,5}
        2nd way: There are two ways of creating arrays
        new int[5]=> create an array of int with size 5
         */
        int[] numbers = new int[5];
        numbers[0]=50;
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;

        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
