package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {
        // create a boolean variable summer store true in it
        //then write a loop that runs as long as it is summer
        // create a temperature variable and store 85 and
        //inside the loop check the temperature
        //if it's less than 100 print "I enjoy summer"
        //as soon as it exceeds 100 print "its very hot" and break the loop with break keyboard
        int temp=85;
        boolean summer=true;
        while(summer){
            if (temp<100){
                System.out.println("I enjoy summer");
                temp=temp+6;

            }else {
                System.out.println("It's too hot");
                break;
            }




        }


    }
}
