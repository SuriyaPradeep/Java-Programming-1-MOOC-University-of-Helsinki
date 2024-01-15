/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suriya
 */
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> todo;

    public TodoList() {
        this.todo = new ArrayList<>();
    }

    public void add(String task) {
        todo.add(task);
    }

    public void print() {
        for (int i = 0; i < todo.size(); i++) {
            System.out.println(i + 1 + ": " + todo.get(i));
        }
    }

    public void remove(int number) {
        todo.remove(number - 1);
    }
}
