package class3;

public class E8StringConcat {
    public static void main(String[] args) {
        System.out.println("Leo"+10+10);
        //paranthesis can help ignore left to right rule
        System.out.println("Leo"+(10+10));
        System.out.println(10+10+"Leo");
        //Java goes from top to bottom and left to right
        //Left to Right rule is not applicable to math ops
        //Multiplication has priority over addition
        System.out.println(2+2*2);
        System.out.println((2+2)*2);


    }
}
