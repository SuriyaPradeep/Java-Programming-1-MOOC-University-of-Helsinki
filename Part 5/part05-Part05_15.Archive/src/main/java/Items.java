/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Suriya
 */
public class Items {
    private String code;
    private String name;
    public Items(String code,String name){
        this.code=code;
        this.name=name;
    }
    public boolean equals(Object compared){
        if(this==compared)
            return true;
        if(!(compared instanceof Items))
            return false;
        Items compare=(Items)compared;
        if(this.code.equals(compare.code))
            return true;
        return false;
    } 
    public String toString(){
        return this.code+":"+" "+this.name;
    }
}
