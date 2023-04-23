package class12;

public class E11StringDemo {
    public static void main(String[] args) {

        String name="Today is Saturday";
        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('a')); //if there are multiple, will give the first one
        // after the 'a' add ,(index no)will start counting from 4th index
        System.out.println(name.indexOf('a',4));

    }
}
