/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManipulationDirectories;
import controller.GenerateContent;
import controller.GenerateFile;
import controller.enumSortType;
import controller.MethodSort;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jece Xavier
 */
public class Play {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //MethodSort stbu = new MethodSort(enumSortType.BUBBLESORT);
        //MethodSort stse = new MethodSort(enumSortType.SELECTIONSORT);
        //MethodSort stin = new MethodSort(enumSortType.INSERTIONSORT);
        //MethodSort stme = new MethodSort(enumSortType.MERGESORT);
        MethodSort stqu = new MethodSort(enumSortType.QUICKSORT);
        //MethodSort stsh = new MethodSort(enumSortType.SHELLSORT);
        //MethodSort sthe = new MethodSort(enumSortType.HEAPSORT);
    }
    
}
