import java.util.Scanner;

public class tp3_pr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input a floating-point number: ");
        double number = scanner.nextDouble();


        int integralDigits = (int) number;


        int fractionalDigits = String.valueOf(number).split("\\.")[1].length();

        System.out.println("Number of digits in the integral part: " + String.valueOf(integralDigits).length());
        System.out.println("Number of digits in the fractional part: " + fractionalDigits);
    }
}
