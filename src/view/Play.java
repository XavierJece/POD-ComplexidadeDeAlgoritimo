/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.enumSortType;
import controller.MethodSort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.GenerateContent;
import model.ManipulationDirectories;
import model.Ordering;
import model.enumOrdertype;

/**
 *
 * @author Jece Xavier
 */
public class Play {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        //MethodSort stbu = new MethodSort(enumSortType.BUBBLESORT);
        //MethodSort stse = new MethodSort(enumSortType.SELECTIONSORT);
        //MethodSort stin = new MethodSort(enumSortType.INSERTIONSORT);
        //MethodSort stme = new MethodSort(enumSortType.MERGESORT);
        //MethodSort stqu = new MethodSort(enumSortType.QUICKSORT);
        //MethodSort stsh = new MethodSort(enumSortType.SHELLSORT);
        //MethodSort sthe = new MethodSort(enumSortType.HEAPSORT);
        
        /*try {
            //int n[] = ManipulationDirectories.readFile("Ascending_10", 10);
            //int n[] = ManipulationDirectories.readFile("Decreasing_10", 10);
            int n[] = ManipulationDirectories.readFile("Random_20-0", 20);
            
            for (int i = 0; i < n.length; i++) {
                System.out.println("n[" + i + "] = " + n[i]);
            }
     
            Ordering.mergeSort(n, n.length);
            
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            for (int i = 0; i < n.length; i++) {
                System.out.println("n[" + i + "] = " + n[i]);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }*/
        
        try {
            //String time = GenerateContent.runTime(enumSortType.INSERTIONSORT, enumOrdertype.DECREASING, 500);
            //System.out.println("Tempo de execução = " + time);
        
            MethodSort stin = new MethodSort(enumSortType.SELECTIONSORT);
        
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
         //new WindwonsGraphic(enumSortType.BUBBLESORT, enumOrdertype.DECREASING).setVisible(true);
        //new WindowsInicial().setVisible(true);
    }
    
}
