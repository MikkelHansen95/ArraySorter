/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraysorter;

/**
 *
 * @author Mikkel
 */
public class run {
    
    public static void main(String[] args) {
        Integer[] intarr = new Integer[]{1,2,3,4,5};
        
        ArraySorter<Integer> as = new ArraySorter<Integer>(intarr,5);
        
        as.enqueue(2);
        
        System.out.println(as.toString());
        
    }
    
}
