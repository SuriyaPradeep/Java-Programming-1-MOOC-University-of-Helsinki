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
public class Hold {
    private ArrayList<Suitcase> suitcase;
    private int maxweight;
    private int currweight;
    public Hold(int maxweight){
        this.maxweight=maxweight;
        this.suitcase=new ArrayList<>();
        this.currweight=0;
    }
    public void addSuitcase(Suitcase suitcase){
        int iweight=suitcase.totalWeight();
        if(this.currweight+iweight<=this.maxweight){
            this.suitcase.add(suitcase);
            this.currweight+=iweight;
        }
        
    }
    public String toString(){
        return this.suitcase.size()+" suitcases ("+this.currweight+" kg)";
    }
    public void printItems(){
        for(Suitcase suitcase:this.suitcase){
            suitcase.printItems();
        }
    }
    
}
