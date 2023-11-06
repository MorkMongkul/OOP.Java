import java.util.Scanner;

public class tp3_pr4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the amount of money (riels) : ");
        int moneyRiels = scanner.nextInt();
        // conversion rate 1USD = 4000 riels
        float moneyDollars = moneyRiels/4000f;
        System.out.println(" You money " + moneyRiels +"riels = "+ moneyDollars+ "USD");
    }
}
