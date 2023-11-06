import java.util.Scanner;

public class tp3_pr5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int distance = 7; // km
        int averageSpeed = 30; // km/hour

        System.out.println(" Please inpute traffic jam factor in ( percentage [0-100]: ");
        int trafficJamFactor = scanner.nextInt();

        double adjustSpeed = averageSpeed-(averageSpeed-trafficJamFactor)/100.0;

        double durationInMinutes = distance / adjustSpeed * 60;

        // Convert the duration to HH:mm:ss format
        int hours = (int) (durationInMinutes / 60);
        int minutes = (int) (durationInMinutes % 60);
        int seconds = (int) ((durationInMinutes % 1) * 60);

        // Display the duration in HH:mm:ss format
        System.out.print("Travelling Duration = ");
        if (hours < 10) {
            System.out.print("0");
        }
        System.out.print(hours + ":");
        if (minutes < 10) {
            System.out.print("0");
        }
        System.out.print(minutes + ":");
        if (seconds < 10) {
            System.out.print("0");
        }
        System.out.println(seconds);
    }
}
