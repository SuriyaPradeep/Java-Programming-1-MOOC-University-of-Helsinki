
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdList list=new BirdList();
        while(true){
            System.out.println("?");
            String command=scan.nextLine();
            if(command.equals("Add")){
                System.out.println("Name:");
                String name=scan.nextLine();
                System.out.println("Name in Latin");
                String latinName=scan.nextLine();
                Bird bird=new Bird(name,latinName);
                list.add(bird);
            } else if(command.equals("Observation")){
                System.out.println("Name?");
                String name=scan.nextLine();
                list.observation(name);
            } else if(command.equals("One")){
                System.out.println("Name?");
                String name=scan.nextLine();
                list.printOne(name);
            } else if(command.equals("All")){
                list.printList();
            } else if(command.equals("Quit")){
                break;
            }
        }

    }

}
