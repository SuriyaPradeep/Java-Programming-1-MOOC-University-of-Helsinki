
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums=0;
        int sum=0;
        while(true){
            System.out.println("Give a number:");
            int num=scanner.nextInt();
            if(num==0){
                break;
            }
            nums++;
            sum=sum+num;
        }
        double avg = ((double)sum/(double)nums);
        System.out.println("Average of the numbers: "+avg);

    }
}
