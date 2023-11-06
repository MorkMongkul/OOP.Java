import java.util.Scanner;
public class tp3_pr3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Input start times ( hours, minutes, seconds ): ");
        int startHours = scanner.nextInt();
        int startMinutes = scanner.nextInt();
        int startSeconds = scanner.nextInt();

        System.out.println(" Input End times( hours, minutes, seconds) :  ");
        int endHours = scanner.nextInt();
        int endMinutes = scanner.nextInt();
        int endSeconds = scanner.nextInt();

        int totalStart = (startHours*3600)+(startMinutes*60)+(startSeconds);
        int totalEnd = ( endHours*3600)+(endMinutes*60)+endSeconds;

        int totalSeconds = (totalEnd-totalStart);
        System.out.println(" Total seconds =  "+ totalSeconds);

        int hDuration = totalSeconds/3600;
        int mDuration = (totalSeconds % 3600)/60;
        int sDuration = (totalSeconds % 60);
        System.out.println(" Total Call duration: " + hDuration+ "h:" + mDuration +"mn:"+ sDuration+"s");
        float totalInMinute = (float)(totalSeconds )/60;
        double totalCost = totalInMinute*0.05;
        System.out.printf(" Total cost of this call : "+ totalCost +"$");
    }

}
