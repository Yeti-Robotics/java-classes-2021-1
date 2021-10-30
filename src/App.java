import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, Aidan!");

        /*
        primitive data types in java:
            int is an integer (a whole number)
            double is a decimal
            float is also a decimal (but worse)
            boolean is true or false
            char is a single thing (inside of '')
        non primitive data types
            String is a sequence of chars (inside of "")
            Array is a container for things of the same type
        */
        int num = 7;
        double num2 = 7.9;
        boolean bool = true;
        char letter = 'o';
        String stringVariable = "Whatever we want";
        //System.out.println(letter);
        //Sam is da best
        
         /*
        arithmetic operators in java: +, -, /, *, and % (modulus, gives the remainder of division)
        relational operators: >, <, >=, <=, ==, !=
         */

        System.out.println(5 != 5);

        // note: index 0 is the first element
        int[] integerArray = {1,6,4,7,1,8,3};
        System.out.println(Arrays.toString(integerArray));
        for (int i = integerArray.length - 1; i >= 0; i-=2) {
            System.out.println(integerArray[i]);
        }
    }
}
