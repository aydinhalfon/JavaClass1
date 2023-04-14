package class6;

public class E4SwitchStatement {
    public static void main(String[] args) {

        // if there's no break, we will get multiple values
        //e.g if we remove the first break here, the output will be
        //Monday
        //Tuesday

        // default runs just like the else statement if
        // everything is wrong

        int day = 7;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day number");
        }
    }
}
