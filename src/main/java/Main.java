import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        input = myScanner.nextLine();

        double firstNumber = Double.parseDouble(input);

        System.out.println("Enter the second number:");
        input = myScanner.nextLine();
        double secondNumber = Double.parseDouble(input);

        String menu =
                """
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option:""";

        System.out.println(menu);
        System.out.println("Whew... good thing you want to multiply.");

        double product = firstNumber * secondNumber;

        System.out.printf("%f times %f equals %f", firstNumber, secondNumber, product);

    }
}
