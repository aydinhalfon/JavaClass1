package class3;

public class E14TypeCasting {
    public static void main(String[] args) {
        /* short num=1200;
        byte num2=num;  won't work bc short is bigger than byte */
        //However, we can force java but lose some data when printed
        short num=1200;
        byte num2=(byte)num;
        System.out.println(num2);
        //Here however it's within the range and works fine
        // short num=126;
        //byte num2=(byte)num;
        //System.out.println(num2);
    }
}

