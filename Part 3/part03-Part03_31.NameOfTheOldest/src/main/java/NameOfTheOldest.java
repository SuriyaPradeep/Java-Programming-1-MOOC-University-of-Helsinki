
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        String name="";
        int max=0;
        while(!(input.isEmpty())){
            String[] split=input.split(",");
            int age=Integer.valueOf(split[1]);
            if(age>max){
                max=age;
                name=split[0];
            }
            input=scanner.nextLine();
        }
        System.out.println("Name of the oldest: "+name);


    }
}
