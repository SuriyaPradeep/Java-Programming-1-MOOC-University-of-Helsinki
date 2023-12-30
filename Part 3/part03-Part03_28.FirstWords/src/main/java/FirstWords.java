
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        while(!(input.isEmpty())){
            String[] split=input.split(" ");
            System.out.println(split[0]);
            input=scanner.nextLine();
        }


    }
}
