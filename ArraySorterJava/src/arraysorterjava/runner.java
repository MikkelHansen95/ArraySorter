/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysorterjava;

import java.util.Collections;

/**
 *
 * @author Mikkel
 */
public class runner {

    
    public static void main(String[] args) {
        Integer[] intarr = new Integer[]{1,5,9,4,6};
        
        myObject[] objects = new myObject[]{new myObject("Peter", 25), new myObject("Lars", 19)};
        
       ArraySorterJava<Integer> as = new ArraySorterJava<>(intarr,5);
        ArraySorterJava<myObject> as1 = new ArraySorterJava<myObject>(objects,objects.length);
        
        
        as1.enqueue(new myObject("Jonas", 23));
        as1.sortDescending();
        as1.sort(new nameComparator());
        as1.printstack();
        
        
        as.sortAscending();
        as.enqueue(7);
        as.printstack();
        as.sortDescending();
        as.printstack();
        
    }
    
}

    

