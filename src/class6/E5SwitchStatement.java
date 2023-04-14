package class6;

public class E5SwitchStatement {
    public static void main(String[] args) {
        /* Switch does not work with all the data types
        doesnt work with boolean, long, double, float
         */
        //String, int, byte and short will work

        //Also can't use relational operators with switch

        char gender = 'F';
        switch (gender) {
            case 'F':
                System.out.println("Female");
                break;
            case 'M':
                System.out.println("Male");
                break;
            case '0':
                System.out.println("Others");
                break;
            default:
                System.out.println("Char not supported");
        }
    }
}
