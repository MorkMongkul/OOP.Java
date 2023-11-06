import java.util.Scanner;
public class tp3_pr2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println( " Input Numbers in hours: ");
        int hours = scanner.nextInt();

        System.out.println(" Input Numbers in Minutes: ");
        int minutes = scanner.nextInt();

        System.out.println(" Input Numbers in Seconds: ");
        int seconds = scanner.nextInt();

        int NumberofSeconds = (hours*3600)+(minutes*60)+seconds;
        System.out.println(" Number of Seconds = " + NumberofSeconds + " seconds ");


    }
}
