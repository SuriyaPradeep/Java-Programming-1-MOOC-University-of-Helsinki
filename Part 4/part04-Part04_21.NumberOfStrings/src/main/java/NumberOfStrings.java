
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        String str;
        while(true){
            str=scanner.nextLine();
            if(str.equals("end")){
                break;
            }
            count++;
                
        }
        System.out.println(count);
    }
}
