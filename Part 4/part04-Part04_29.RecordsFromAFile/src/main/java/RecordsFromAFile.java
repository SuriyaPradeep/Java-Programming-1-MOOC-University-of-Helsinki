
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String filename=scanner.nextLine();
        try(Scanner file=new Scanner(Paths.get(filename))){
            while(file.hasNextLine()){
                String str=file.nextLine();
                String[] arr=str.split(",");
                if(Integer.valueOf(arr[1])==1){
                    System.out.println(arr[0]+", age: "+arr[1]+" year");
                } else{
                System.out.println(arr[0]+", age: "+arr[1]+" years");
            }
            }
        }catch(Exception e){
            System.out.println("Reading the file " + filename + " failed.");
        }

    }
}
