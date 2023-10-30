import java.util.Scanner;
public class Tp02Pr3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please Input the value of y= ");
        double y = scanner.nextDouble();
        System.out.println("Please input the value of z= ");
        double z = scanner.nextDouble();
        double Result = 1/(1/y + 1/z);
        System.out.println(" Result of x = " + Result);
    }
}
