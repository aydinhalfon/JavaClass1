package class13;

public class MultiplyClass {
    void multiply(int num1, int num2){
        System.out.println(num1*num2);
    }

    public static void main(String[] args) {
        MultiplyClass multiply=new MultiplyClass();
        multiply.multiply(10,3);
    }
}
