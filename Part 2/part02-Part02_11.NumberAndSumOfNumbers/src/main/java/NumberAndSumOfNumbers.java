
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
        System.out.println("Number of numbers: "+nums+"\nSum of the numbers: "+sum);
    }
}
