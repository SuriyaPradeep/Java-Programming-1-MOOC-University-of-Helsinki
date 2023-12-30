
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        while(!(input.isEmpty())){
            String[] split=input.split(" ");
            for(String str:split){
                if(str.contains("av")){
                    System.out.println(str);
                }
            }
            input=scanner.nextLine();
        }

    }
}
