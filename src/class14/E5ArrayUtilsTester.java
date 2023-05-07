package class14;

public class E5ArrayUtilsTester {
    public static void main(String[] args) {
        int a=20;
        int [] arr={10,20,45};
        E5ArrayUtils test=new E5ArrayUtils();
        boolean result=test.contains(arr,a);
        System.out.println(result);
    }

}
