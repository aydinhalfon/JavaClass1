package class14;

public class E1Methods {

    void printWord(String word){
        System.out.println(word);

    }

    /*
    void == return type of the method void means this method does not return any data
    other examples of return types can be String int boolean char etc.
    printWord== it's the name of the method
    (String word) == parameter/input

    {System.out.println(word);} == Body of the method you can write if else conditions
    loops, switch  statements etc.
     */



    public static void main(String[] args) {
        // we are creating an object of the E1Methods class
        // in Java all the classes can be treated as data types
        // new E1Methods(); == creating the object of the E1Methods class
        E1Methods obj=new E1Methods();
        // We are calling the printWord() method on obj object and passing "java"
        // argument or input
        obj.printWord("Java");
    }
}
