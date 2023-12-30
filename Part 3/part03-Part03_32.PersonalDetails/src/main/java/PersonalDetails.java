
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        int lon=0;
        String name="";
        int sum=0;
        int count=0;
        while(!(input.isEmpty())){
            String[] split=input.split(",");
            int year=Integer.valueOf(split[1]);
            if(split[0].length()>lon){
                name=split[0];
                lon=split[0].length();
            }
            sum+=year;
            count++;
            input=scanner.nextLine();
        }
        System.out.println("Longest name: "+name);
        double avg = (double)sum/count;
        System.out.println("Average of the birth years: "+avg);

    }
}
