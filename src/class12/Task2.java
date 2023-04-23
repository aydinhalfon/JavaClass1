package class12;

public class Task2 {
    public static void main(String[] args) {
        String name="Today is Saturday";
        //print all the indexes where the letter 'a' is appearing
        // expected output 3 10 15

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)=='a'){
                System.out.print(i+" ");
            }

        }
    }
}
