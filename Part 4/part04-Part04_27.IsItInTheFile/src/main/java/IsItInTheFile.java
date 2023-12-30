
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String search = scanner.nextLine();
        int flag=0;
        try(Scanner fileReader=new Scanner(Paths.get(file))){
            while(fileReader.hasNextLine()){
                String name=fileReader.nextLine();
                if(name.equals(search)){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Not found");
            } else{
                System.out.println("Found!");
            }
        } catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        

    }
}
