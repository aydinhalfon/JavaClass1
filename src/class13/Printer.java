package class13;

public class Printer {

    void printSomething(){
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");
        System.out.println("Hello Java");

        //above can only printe hello java
    }
        // below can use any value we give to it afterwards
    void printWord(String word){
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);
        System.out.println(word);

    }
    void printWordManyTimes(String word, int numberOfTimes){

        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println(word);

        }
    }
}
