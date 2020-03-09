/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysorterjava;

/**
 *
 * @author Mikkel
 */
public class myObject implements Comparable<myObject>{

    String name;
    int age;

    public myObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(myObject o) {
        if(this.age == o.age){
            return 0;
        }else if(this.age > o.age){
           return 1;   
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "name: " + this.name + " & age: " + this.age ;//To change body of generated methods, choose Tools | Templates.
    }
    
    
};