
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String fName=scanner.nextLine();
        while(!(fName.isEmpty())){
            System.out.println("Last name: ");
            String lName=scanner.nextLine();
            System.out.println("Identification number: ");
            String iNo=scanner.nextLine();
            infoCollection.add(new PersonalInformation(fName,lName,iNo));
            System.out.println("First name: ");
            fName=scanner.nextLine();
        }
        for(PersonalInformation pi:infoCollection){
            System.out.println(pi.getFirstName()+" "+pi.getLastName());
        }

    }
}
