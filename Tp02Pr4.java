import java.util.Scanner;

public class Tp02Pr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a number: ");
        int number = scanner.nextInt();

        int hundreds = number / 100;

        System.out.println("The number of hundreds in " + number + " is " + hundreds);
    }
}
