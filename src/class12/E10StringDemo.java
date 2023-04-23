package class12;

public class E10StringDemo {
    public static void main(String[] args) {
        String name="LERANDROR";
        //System.out.println(name.charAt(1));
        //just like arrays, it will give us the letter from that index
        int lettercount=0;
        for (int i = 0; i < name.length(); i++) {
           // System.out.println(name.charAt(i));
            if (name.charAt(i)=='R'){
                lettercount++;
            }

            }
        System.out.println(lettercount);



        }

    }

