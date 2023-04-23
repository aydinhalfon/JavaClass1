package class13;

public class E6StringDemo {
    public static void main(String[] args) {

        String str="Wife";
        str.toLowerCase();
        System.out.println(str);

        StringBuilder str2=new StringBuilder("Husband");
        str2.reverse();
        System.out.println(str2);

        //once you create a string, even if you use a method on it, it won't
        //change the original variable but when you use a StringBuilder
        // it will change the original variable as the examples below

    }
}
