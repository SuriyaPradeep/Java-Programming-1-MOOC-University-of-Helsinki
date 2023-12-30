
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        int max=0;
        while(!(input.isEmpty())){
            String[] split=input.split(",");
            int age=Integer.valueOf(split[1]);
            if(age>max){
                max=age;
            }
            input=scanner.nextLine();
        }
        System.out.println("Age of the oldest: "+max);
        


    }
}
