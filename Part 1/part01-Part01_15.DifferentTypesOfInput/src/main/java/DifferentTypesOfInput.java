
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        int num1 = Integer.valueOf(scan.next());
        System.out.println("Give a double:");
        double num2 = Double.valueOf(scan.next());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.next());
        System.out.println("You gave the string "+str+"\nYou gave the integer "+num1+"\nYou gave the double "+num2+"\nYou gave the boolean "+bool);

    }
}
