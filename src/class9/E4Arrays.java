package class9;

public class E4Arrays {
    public static void main(String[] args) {
        /*
        create an array of strings store 5 names in that array
        print all of the names from that array with the help of a for loop
        try printing with the help of a while loop as well
         */

        //for loop below

        String [] names={"Ahmet", "Mehmet", "Ali", "Fatma"};
       for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }
// while loop below
        int j=0;
        while (j<names.length){
            System.out.println(names[j]);
            j++;

        }



    }
}
