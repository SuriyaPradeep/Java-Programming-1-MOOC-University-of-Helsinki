import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        ArrayList<Book> books=new ArrayList<>();
        System.out.println("Title: ");
        String name=scanner.nextLine();
        while(!(name.isEmpty())){
            System.out.println("Pages: ");
            int pages=Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year=Integer.valueOf(scanner.nextLine());
            books.add(new Book(name,pages,year));
            System.out.println("Title: ");
            name=scanner.nextLine();
        }
        System.out.println("What information will be printed?");
        String info=scanner.nextLine();
        if(info.equals("everything")){
            for(Book book:books){
                System.out.println(book);
            }
        } else{
            for(Book book:books){
                System.out.println(book.getName());
            }
        }

    }
}
