
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        int count=0;
        int win=0;
        int lost=0; 
        try(Scanner File=new Scanner(Paths.get(fileName))){
            while(File.hasNextLine()){
                String str=File.nextLine();
                if (str.isEmpty()){
                    continue;
                }
                String[] info=str.split(",");
                String team1=info[0];
                String team2=info[1];
                int score1=Integer.valueOf(info[2]);
                int score2=Integer.valueOf(info[3]);
                if(team1.equals(team)){
                    count++;
                    if(score1>score2){
                        win++;
                    }else{
                        lost++;
                    }
                }
                else if(team2.equals(team)){
                    count++;
                    if(score2>score1){
                        win++;
                    }else{
                        lost++;
                    }
                }
            }
            System.out.print("Games: "+count);
            System.out.print("\nWins: "+win);
            System.out.print("\nLosses: "+lost);
            
        } catch(Exception e){
            System.out.println("Reading the file " + fileName + " failed.");
        }

    }

}
