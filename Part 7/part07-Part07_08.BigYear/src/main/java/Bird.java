/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suriya
 */
public class Bird {
    private String name;
    private String latinName;
    private int obs;
    public Bird(String name,String latin){
        this.name=name;
        this.latinName=latin;
        this.obs=0;
    }
    public void addObservation(){
        obs+=1;
    }
    public String getName(){
        return name;
    }
    public int getObservation(){
        return obs;
    }
    
    @Override
    public String toString(){
        return name+"{"+latinName+")"+": "+obs+" observation";
    }
}
