import java.util.Scanner;
public class Tp02pr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Input your start number: ");
        int startNumber = scanner.nextInt();
        System.out.println(" Input your end number: ");
        int endNumber = scanner.nextInt();
        System.out.println( " Input your Increment Number: ");
        int increment = scanner.nextInt();
        int Result = (endNumber-startNumber)/increment;

        System.out.println( " Your Summation = " + Result);

    }
}
