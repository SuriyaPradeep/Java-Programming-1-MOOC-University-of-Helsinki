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
public class Suitcase {
    private ArrayList<Item> items;
    private int maxweight;
    private int currweight;
    public Suitcase(int maxweight){
        this.maxweight=maxweight;
        this.items=new ArrayList<>();
        this.currweight=0;
    }
    public void addItem(Item item){
        int iweight=item.getWeight();
        if(this.currweight+iweight<=this.maxweight){
            this.items.add(item);
            this.currweight+=iweight;
        }
        
    }
    public String toString(){
        String op;
        if(this.items.isEmpty()){
            op="no items (0 kg)";
        }
        else if(this.items.size()==1){
            op="1 item ("+this.currweight+" kg)";
        }
        else{
            op=this.items.size()+" items ("+this.currweight+" kg)";
        }
        return op;
    }
    public void printItems(){
        for(Item item:this.items){
            System.out.println(item);
        }
    }
    public int totalWeight(){
        return this.currweight;
    }
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        int heavy=this.items.get(0).getWeight();
        Item temp=this.items.get(0);
        for(Item item:this.items){
            if(heavy<item.getWeight()){
                temp=item;
                heavy=item.getWeight();
            }
        }
        return temp;
    }
    
}
