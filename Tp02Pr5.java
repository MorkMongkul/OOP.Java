import java.util.Scanner;
public class Tp02Pr5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please input your number: ");
        int number = scanner.nextInt();
        System.out.println( " Your Numbers is : " + number);
        int fool = number+1;
        System.out.println( " I got " + fool + ", I am luckier! ");
    }
}
