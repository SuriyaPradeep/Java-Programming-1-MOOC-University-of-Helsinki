

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());
        int flag=0;
        for(int i=0;i<array.length;i++){
            if(search==array[i]){
                System.out.println(search+" is at index "+i+".");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println(search+" was not found.");
        }

        // Implement the search functionality here
    }

}
