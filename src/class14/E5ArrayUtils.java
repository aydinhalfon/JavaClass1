package class14;

public class E5ArrayUtils {
    /*
    create a method call it contains it should take an array of integers and
    an integer number in the method body it should search the array for that number
    if number is present in the array method should return true otherwise method
    should return false in a separate class call the method and test it for below
    input {10,20,45} number 20
     */

    boolean contains(int[]arr, int num){
        boolean isFound=false;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==num){
                isFound=true;
            }

        }return isFound;
    }

    }

