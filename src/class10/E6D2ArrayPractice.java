package class10;

public class E6D2ArrayPractice {
    public static void main(String[] args) {
        int [][] ages = {
                {20,55,69,87,105},
                {105,63,87},
                {21,25,87,98},
                {35,65,98,74,20,147}
                
        };

        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages[i].length; j++) {
                System.out.print(ages[i][j]+" ");

            }
            System.out.println();
        }

        
        
    }
}
