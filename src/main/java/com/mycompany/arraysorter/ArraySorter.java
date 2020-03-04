/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraysorter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Mikkel & Mathias
 * @param <T>
 */
public class ArraySorter<T>{
    
     T[] array;
     
    public ArraySorter(T[] items, int size) {
        array = items;
    
    }
    
    public void enqueue(T item) {
        array.add(item);
    }
    
    public T dequeue() {
        T item = array.remove(0);
        return item;
    };
    
    public void sortAscending(){
        
    };
    
    public void sortDescending(){
        
    };
    
    public void sort(Comparator<T> comparator){
        
    }
    
}
