/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suriya
 */
public class Container {
    private int amt;
    public Container(){
        this.amt=0;
    }
    public int contains(){
        return amt;
    }
    public void add(int amount){
        if(amount>0){
            amt+=amount;
            if(amt>100){
                amt=100;
            }
        }
    }
    public void remove(int amount){
        if(amount>0){
            amt-=amount;
            if(amt<0){
                amt=0;
            }
        }
    }
    public String toString(){
        return amt+"/100";
    }
}
