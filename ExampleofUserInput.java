import java.util.Scanner;
public class ExampleofUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the firstNumber: ");
        int firstNumber = scanner.nextInt();
        System.out.println(" Please Enter your secondNumber: ");
        int secondNumber = scanner.nextInt();
        int Result = firstNumber+secondNumber;
        System.out.println("Your summation = " + Result );

    }
}