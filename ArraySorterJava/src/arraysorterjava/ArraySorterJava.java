/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysorterjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Mikkel & Mathias
 * @param <T>
 */
public class ArraySorterJava<T extends Comparable <T>> {

    T[] array;
    

    public ArraySorterJava(T[] items, int size) {
        this.array = (T[]) new Comparable[size];
        for (int i = 0; i < size; i++) {
            this.array[i] =  items[i];
        }
    }

    public void enqueue(T item) {
        int size = this.array.length;
        T[] arr = (T[]) new Comparable[size + 1];
        for (int i = 0; i < size; i++) {
            arr[i] = this.array[i];
            if (i == size - 1) {
                arr[i + 1] = item;
            }
        }
        this.array = arr;
        sortAscending();
    }

    public T dequeue() {
        T item = this.array[0];
        int size = this.array.length;
        T[] arr = (T[]) new Comparable[size - 1];

        for (int i = 0; i < size -1; i++) {
            arr[i] = this.array[i + 1];
        }
        
        this.array = arr;
        return item;
    };
    
    public void sortAscending() {
        sort((a, b) -> a.compareTo(b));
    };
    
    public void sortDescending() {
        sort((a, b) -> b.compareTo(a));
    };


    public void sort(Comparator<T> comparator) {
        
        int size = this.array.length;
        
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(this.array, size, i, comparator);
        }
        for (int i = size - 1; i >= 0; i--) {
            T temp = this.array[i];
            T temp0 = this.array[0];
            this.array[i] = temp0;
            this.array[0] = temp;
            heapify(this.array, i, 0, comparator);
        }
    };
    
    private void heapify(T[] arr, int n, int i, Comparator comparator) {
        int largest = i; // Initialize largest as root 
        int l = 2 * i + 1; // left = 2*i + 1 
        int r = 2 * i + 2; // right = 2*i + 2 

        // If left child is larger than root 
        if (l < n && comparator.compare(arr[l], arr[largest]) > 0) {
            largest = l;
        }
        // If right child is larger than largest so far 
        if (r < n && comparator.compare(arr[r], arr[largest]) > 0) {
            largest = r;
        }
        // If largest is not root 
        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest, comparator);
        }
    }

    public void printstack() {
        for (int i = 0; i < array.length; i++) {
            T t = array[i];
            System.out.println(t.toString());
        }
        System.out.println("");
    };



}
