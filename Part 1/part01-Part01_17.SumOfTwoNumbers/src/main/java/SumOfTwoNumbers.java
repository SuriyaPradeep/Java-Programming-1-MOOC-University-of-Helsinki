
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scan.nextLine());
        int sum=num1+num2;
        System.out.println("The sum of the numbers is "+sum);

    }
}
