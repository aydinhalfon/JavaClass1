package class6;

import java.util.Scanner;

public class Hw1WeekdayWeekend {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Weekday or weekend");
        int weekDay=scan.nextInt();
        if (weekDay >=1 && weekDay<=5){
            System.out.println("It's a weekday");
        }else if (weekDay==6 || weekDay==7){
            System.out.println("It is weekend");
        }else {
            System.out.println("Invalid day");
        }
    }
}
