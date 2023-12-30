
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!(input.isEmpty())){
            String[] str=input.split(" ");
            for(String s:str){
                System.out.println(s);
            }
            input=scanner.nextLine();
        }
    }

}
