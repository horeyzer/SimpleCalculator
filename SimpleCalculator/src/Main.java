import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float firstNumber = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float secondNumber = sc.nextFloat();

        float sum = firstNumber + secondNumber;
        float diff = firstNumber - secondNumber;
        float product = firstNumber * secondNumber;
        float quotient = (secondNumber !=0) ? firstNumber / secondNumber : Float.NaN;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);

        if (!Float.isNaN(quotient))
        {
            System.out.println("Quetient: " + quotient);
        }
        else
        {
            System.out.println("Quotient: cannot divide by zero.");
        }
    }
}