
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secs_day=86400;
        System.out.println("How many days would you like to convert to seconds?");
        int days=scanner.nextInt();
        System.out.println(days*secs_day);
    }
}
