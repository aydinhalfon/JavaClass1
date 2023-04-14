package class7;

public class E11WhileLoops {
    public static void main(String[] args) {
        /*
        Print numbers from 100 to 1
        Print even numbers from 20 to 100
        Print only odd numbers from 100 to 10
         */
        int counter = 100;
        while (counter >= 1) {
            System.out.print(counter + " ");

            counter -= 1;
        }
        counter = 20;
        System.out.println();
        while (counter <= 100) {
            System.out.print(counter + " ");
            counter += 2;
        }

        counter = 100;
        System.out.println();
        while (counter >= 10) {
            if (counter % 2 == 1) {
                System.out.print(counter + " ");
            }
            counter--;
        }
    }
}
