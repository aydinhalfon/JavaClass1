package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="fjksdk lnfjSFJHSKDJFSK124564**----//-*-*%%&&";

        System.out.println(str.replaceAll("[^a-z]","")); //^ not operator for regular expressions
        System.out.println(str.replaceAll("[a-z]",""));
        //below = don't replace lowercase letters from a-z and numbers from 0-9
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[Dn4]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        // Dolar sign is a special one that we use \\ to replace
        System.out.println(str.replaceAll(" ","\\$")); //replaces the space with a dolar sign


    }
}
