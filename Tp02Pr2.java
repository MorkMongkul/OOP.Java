import java.util.Scanner;

public class Tp02Pr2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please input width (in meter): ");
        int widthInMeters = scanner.nextInt();

        System.out.println(" Please input height (in meter): ");
        int heightInMeters = scanner.nextInt();

        int perimeter = (widthInMeters + heightInMeters) * 2;
        int surface = widthInMeters * heightInMeters;

        System.out.println(" Perimeter = (" + widthInMeters + "+" + heightInMeters +")*2 = " + perimeter);
        System.out.println(" Surface = " + widthInMeters +"x"+heightInMeters + "=" + surface);
    }
}