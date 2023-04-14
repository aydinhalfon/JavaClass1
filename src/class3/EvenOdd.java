package class3;

public class EvenOdd {
    public static void main(String[] args) {
        int price = 10;
        int remainder = price % 2;
        int num=2;


        if (remainder == 0) {
            System.out.println("This number is even.");


        } else {
            System.out.println("This number is odd.");
        }

        //below is another way of checking

        if (num%2==1) {

            System.out.println("its an odd number");
        }

        else {
            System.out.println("its an even number");
        }


    }
}
