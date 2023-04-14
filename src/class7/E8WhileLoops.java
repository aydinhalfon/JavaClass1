package class7;

public class E8WhileLoops {
    public static void main(String[] args) {
        //print these numbers 10 9 8 7 6 5 4 3 2 1

        //changing println to print will print them side by side
        int counter=10;
        while(counter>=1){
            System.out.println(counter);
            counter-=1;
        }
    }
}
