package class5;

public class E4NestedIf {
    public static void main(String[] args) {

        int money = 50000;
        String day = ("Monday");
        if (money > 10000) {

            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping");

            } else {
                System.out.println("Let's wait till sunday");
            }
        }else{
            System.out.println("let's save more");
        }


    }
}

