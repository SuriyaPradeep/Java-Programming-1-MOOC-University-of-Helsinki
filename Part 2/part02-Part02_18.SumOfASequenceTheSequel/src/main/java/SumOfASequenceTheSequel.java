
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int from=scanner.nextInt();
        System.out.println("\nLast number? ");
        int to=scanner.nextInt();
        int sum=0;
        for(int i=from;i<=to;i++){
            sum+=i;
        }
        System.out.println("\nThe sum is "+sum);

    }
}
