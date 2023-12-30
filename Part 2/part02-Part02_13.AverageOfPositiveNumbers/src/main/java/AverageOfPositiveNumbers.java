
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nums=0;
        float sum=0;
        while(true){
            float num=scanner.nextInt();
            if(num==0){
                break;
            }else if(num>0){
                nums++;
                sum=sum+num;
            }
        }
        if(nums<1){
            System.out.println("Cannot calculate the average");
        }else{
            System.out.println((sum/nums));
        }
        

    }
}
