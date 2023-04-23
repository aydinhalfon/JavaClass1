package class13;

public class E1StringDemo {
    public static void main(String[] args) {
        String str="Batch 16 is good";
        str=str.replace("good","Excellent"); // permanently replaces
        System.out.println(str.replace("good","Excellent"));
        System.out.println(str); // will print the original still, wont cuz we updated the value in ln 6
        System.out.println(str.replace('e','E'));

    }


}
