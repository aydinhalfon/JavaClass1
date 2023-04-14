package class3;

public class PositiveNegative {
    public static void main(String[] args) {
        int price = -20;
        if (price > 0) {
            System.out.println("Positive");

        } else if (price == 0) {
            System.out.println("Neutral");
        } else {
            System.out.println("Negative");

        }
    }
}