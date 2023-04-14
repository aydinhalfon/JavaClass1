package class4;

public class E12NestedIf {
    public static void main(String[] args) {
        System.out.println("3");

        //First checks the first condition -- false, wont move on
        //if true, checks the other and if true will print

        if (10 > 5) {

            //below line depends on the one above

            if (20 > 3) {
                System.out.println("Inside the nested if");
            }
            System.out.println("4");   //this line doesnt depend on any if statement
        }


    }
}
