/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suriya
 */
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary sd;

    public TextUI(Scanner scanner, SimpleDictionary sd) {
        this.scanner = scanner;
        this.sd = sd;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                add();
                continue;
            } else if (command.equals("search")) {
                search();
                continue;
            }
            System.out.println("Unknown command");
        }
    }

    public void add() {
        System.out.print("Word: ");
        String word = scanner.nextLine();
        System.out.print("Translation: ");
        String translation = this.scanner.nextLine();
        sd.add(word, translation);
    }

    public void search() {
        System.out.print("To be translated: ");
        String word = scanner.nextLine();
        String translated = sd.translate(word);
        if (translated == null) {
            System.out.print("Word " + word + " was not found");
        } else {
            System.out.print("Translation: " + translated);
        }
    }

}
