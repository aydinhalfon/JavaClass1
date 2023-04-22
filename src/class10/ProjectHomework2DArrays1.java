package class10;

public class ProjectHomework2DArrays1 {
    public static void main(String[] args) {
        /*
 3 Create a 2D array or integer type where you will store odd and even numbers.
 Develop a program which will  identify/print the even numbers only.
4. Create a 2D array of integers. Develop a program which will calculate
 the sum of even and odd numbers for that array.
5. Write a program to swap 2 numbers without a temporary variable?
6. Write a java program to check whether a given number is prime or not?
7. Write a Java Program to print the first 10 numbers of Fibonacci series.
8. Maximum and minimum number in the array?
9. Write a java program to find the second largest number in the array?
10. Write a program to print out duplicate elements from an Array of Strings?
         */

        //3 2D array + Even Odd + only print even

        int[][] OddEven = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20}
        };
        for (int i = 0; i < OddEven.length; i++) {
            for (int j = 0; j < OddEven[i].length; j++) {
                if (OddEven[i][j] % 2 == 0) {
                    System.out.print(OddEven[i][j]+" ");
                }

            }
            System.out.println();

        }

        //Create a 2D array of integers. Develop a program which will calculate
        // the sum of even and odd numbers for that array.
        int[][] sum = {
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20}
        };

        int sumeven = 0;
        int sumodd = 0;
        for (int a = 0; a < sum.length; a++) {
            for (int b = 0; b < sum[a].length; b++) {
                if (sum[a][b] % 2 == 0) {
                    sumeven = sumeven+sum[a][b];
                } else if (sum[a][b] % 2 == 1) {
                    sumodd = sumodd + sum[a][b];


                }

            }

        }
        System.out.print(sumeven+" ");
        System.out.println(sumodd+" ");


        //5 Write a program to swap 2 numbers without a temporary variable

        int num1 = 5;
        int num2 = 10;

        System.out.println("Before");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);



    }

}
