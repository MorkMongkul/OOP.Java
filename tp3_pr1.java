import java.util.Scanner;
public class tp3_pr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input Numbers in second: ");
        int totalSecond = scanner.nextInt();

        int hours = (totalSecond)/3600;
        int minutes = (totalSecond % 3600)/60;
        int seconds = totalSecond % 60;

        System.out.println(" Time corresponding to " + totalSecond +" is " + hours + ":" + minutes + ":" + seconds );
    }
}

