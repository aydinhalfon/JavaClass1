package class9;

public class E7Arrays {
    public static void main(String[] args) {

        boolean [] flags ={true, false, true, false,false, true};
        // write a loop that counts how many values in above array is false


        /* for (int i = 0; i < flags.length; i++) {
            if (flags[i]==false){
                System.out.println(flags[i]);
            }
        } */
        int counter=0;
        for (int i = 0; i < flags.length; i++) {
            if (flags[i]==false) {
                counter ++;


            }
        }
        System.out.println(counter);











    }
}
