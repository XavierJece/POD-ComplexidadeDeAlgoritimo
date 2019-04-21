/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Jece Xavier
 */
public enum enumSortType {
    //Attributes
    BUBBLESORT("bublleSort"),
    SELECTIONSORT("selectionSort"),
    INSERTIONSORT("insertionSort"),
    MERGESORT("mergeSort"),
    QUICKSORT("quickSort"),
    SHELLSORT("shellSort"),
    HEAPSORT("heapSort");
    
    //Constructor
    private String algorithm;
    
    enumSortType(String algorithm){
        this.algorithm = algorithm;
    }
    
    //My Functions
    
    //Gets and Sets

    public String getAlgorithm() {
        return algorithm;
    }
    
    
}
