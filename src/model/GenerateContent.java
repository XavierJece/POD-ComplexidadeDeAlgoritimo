/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Jece Xavier
 */
public abstract class GenerateContent {
    //Attributes
    //Constructor
    //My Functions
    public static String contentAscending(int quantity){
        String content = "";
        
        for (int i = 0; i < quantity; i++) {
           content += i + "\r\n";
        }
        
        return content;
    }
    
    public static String contentDecreasing(int quantity){
        String content = "";
        
        for (int i = quantity - 1; i >= 0; i--) {
           content += i + "\r\n";
        }
        
        return content;
    }
    
    public static String contentRandom(int quantity){
        String content = "";
        Random n = new Random();
        
        for (int i = 0; i < quantity; i++) {
           content += n.nextInt(quantity) + "\r\n";
        }
        
        return content;
    }
    
    public static long runTime(enumSortType method, enumOrdertype order, int tamanho) throws IOException {
        
        String name = order.getOrder() + "_" + tamanho;
        //String name = order.getOrder() + "_" + tamanho + '-' + variation;
        
        int vetor[] = ManipulationDirectories.readFile(name, tamanho);
        long variationTime = 0;
        
        if(method.getAlgorithm().equals("bublleSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.bubblesort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
            
        }else if(method.getAlgorithm().equals("selectionSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.selectionsort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
            
        
        }else if(method.getAlgorithm().equals("insertionSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.insertionsort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("mergeSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.mergeSort(vetor, vetor.length);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("quickSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.quicksort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("shellSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.shellsort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("heapSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.heapsort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else{
           return variationTime;
        }
        
        
        System.out.println("\nTempo com " + tamanho + " elementos foi de " + variationTime);
        return variationTime;
        
    }
    
    public static long runTime(enumSortType method, enumOrdertype order, int tamanho, int variation) throws IOException {
        
        String name = order.getOrder() + "_" + tamanho + '-' + variation;
        
        int vetor[] = ManipulationDirectories.readFile(name, tamanho);
        long variationTime = 0;
        
        if(method.getAlgorithm().equals("bublleSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.bubblesort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
            
        }else if(method.getAlgorithm().equals("selectionSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.selectionsort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("insertionSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.insertionsort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("mergeSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.mergeSort(vetor, vetor.length);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("quickSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.quicksort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("shellSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.shellsort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else if(method.getAlgorithm().equals("heapSort")){
            
            long initialTime = System.currentTimeMillis();
            
            Ordering.heapsort(vetor);
            
            long finalTime = System.currentTimeMillis();
            
            variationTime = (finalTime - initialTime);
        
        }else{
           return variationTime;
        }
        
        System.out.println("\nTempo com " + tamanho + " e variacao de " + variation + " elementos foi de " + variationTime);
        return variationTime;
        
    }
    
    
    //Gets and Sets
}
