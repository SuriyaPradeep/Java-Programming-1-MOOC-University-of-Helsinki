/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suriya
 */
import java.util.*;
public class BirdList {
    private ArrayList<Bird> list;
    
    public BirdList(){
        this.list=new ArrayList<>();
    }
    public void add(Bird bird){
        list.add(bird);
    }
    public void observation(String name){
        for(Bird bird:list){
            if(bird.getName().equals(name)){
                bird.addObservation();
            }
        }
    }
    public void printOne(String name){
        for(Bird bird:list){
            if(bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
    public void printList(){
        for(Bird bird:list){
            System.out.println(bird);
        }
    }
    
}
