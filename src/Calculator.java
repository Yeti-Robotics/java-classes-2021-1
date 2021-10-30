import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double number1 = input.nextDouble();
        
        System.out.println("Enter the second number: ");
        double number2 = input.nextDouble();

        int choice;
        do {
            System.out.println("Enter 1 for addition, 2 for subtraction, 3 for multiplication, or 4 for division.");
            choice = input.nextInt();

            if(choice == 1){
                System.out.println(add(number1, number2));
            } else if (choice == 2){
                System.out.println(subtract(number1, number2));
            } else if (choice == 3){
                System.out.println(multiply(number1, number2));
            } else if (choice == 4){
                System.out.println(divide(number1, number2));
            }
        } while(choice < 1 || choice > 4);
    }

    private static double add(double numOne, double numTwo) {
        double sum = numOne + numTwo;
        return sum;
    }

    private static double subtract(double numOne, double numTwo){
        double difference = numOne - numTwo;
        return difference;
    }

    private static double multiply(double numOne, double numTwo){
        double product = numOne * numTwo;
        return product;
    }

    private static double divide(double numOne, double numTwo){
        double quotient = numOne / numTwo;
        return quotient;
    }
}
