package class7;

public class E10WhileLoops {
    public static void main(String[] args) {

        // 1 2 4 5 7 8 10 11 13 14 16 17 19 20

        // modulus (multiples of 3 missing meaning that
        // if the remainder is not 0 when divided by 3 then print
        int counter=1;
        while (counter<=20){

            if (counter%3!=0){
                System.out.print(counter+" ");

            }
            counter++;

        }

    }
}
