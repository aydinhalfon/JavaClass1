package class4;

public class E2IfElseStatement {
    public static void main(String[] args) {
        //String is a non primitive data type and we can't use
        // == sign, use name.equals

        //name.equals("Corey" => check if the name and the value that we write
        // inside equals() are same or not
        String name="Jacob";
        if (name.equals("Corey")){
            System.out.println("I like swimming");
        }else {
            System.out.println("I like programming");

        }


    }
}
