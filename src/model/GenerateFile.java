/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jece Xavier
 */
public abstract class GenerateFile {
    //Attributes
    //Constructor
    //My Functions
    public static void createFileAscending(){
        String dir = "src\\database";
 
        if(ManipulationDirectories.createDirectory()){
            String nameFile, content;
            int i=0;

            while(i < 100000){

                if(i < 100){
                    i += 10;
                }else if(i < 1000){
                    i += 100;
                }else if(i < 10000){
                    i += 1000;
                }else{
                    i += 10000;
                }

                nameFile = "Ascending_" + i;
                content = GenerateContent.contentAscending(i);
                
                try {
                    ManipulationDirectories.createFile(dir, nameFile, content);
                } catch (IOException ex) {
                    Logger.getLogger(GenerateFile.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
    
    public static void createFileDecreasing(){
        String dir = "src\\database";
        
        if(ManipulationDirectories.createDirectory()){
            String nameFile, content;
            int i=0;

            while(i < 100000){

                if(i < 100){
                    i += 10;
                }else if(i < 1000){
                    i += 100;
                }else if(i < 10000){
                    i += 1000;
                }else{
                    i += 10000;
                }

                nameFile = "Decreasing_" + i;
                content = GenerateContent.contentDecreasing(i);
                
                try {
                    ManipulationDirectories.createFile(dir, nameFile, content);
                } catch (IOException ex) {
                    Logger.getLogger(GenerateFile.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
    
    public static void createFileRandom(){
        String dir = "src\\database";
        
        if(ManipulationDirectories.createDirectory()){
            String nameFile, content;
            int i=10, j = 0;

            while(i < 100000 || j != 10){

                if(i < 100){
                    if(j == 10){
                        i += 10;
                        j = 0;
                    }
                }else if(i < 1000){
                    if(j == 10){
                        i += 100;
                        j = 0;
                    }
                }else if(i < 10000){
                    if(j == 10){
                        i += 1000;
                        j = 0;
                    }
                }else{
                    if(j == 10){
                        i += 10000;
                        j = 0;
                    }
                }

                nameFile = "Random_" + i + "-" + j;
                content = GenerateContent.contentRandom(i);
                
                try {
                    ManipulationDirectories.createFile(dir, nameFile, content);
                } catch (IOException ex) {
                    Logger.getLogger(GenerateFile.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                j++;
            }
        }
    }
    
    public static void createFileReport(enumSortType method, enumOrdertype order) throws IOException{
        
        String nameFile, content = "";
        int  somatorio = 0, somatorioRandom = 0;

        
        for (int i = 10; i < 100; i+=10) {
            
            for (int j = 0; j < 10; j++) {
                
                if(order.getOrder().equals("Random")){
                    
                    for (int k = 0; k < 10; k++) {
                        somatorioRandom += GenerateContent.runTime(method, order, i, k);
                    }
                    somatorio += somatorioRandom/10;
                    System.out.println("somatorioRandom com " + i + " = " + somatorioRandom/10);
                    somatorioRandom = 0;
                    
                }
                else{
                            
                    somatorio += GenerateContent.runTime(method, order, i);
                    
                }
            }
            
            content += somatorio/10   + "\r\n";
            System.out.println("Media com " + i + " = " + somatorio/10);
            somatorio = 0;
           
        }
        
        for (int i = 100; i < 1000; i+=100) {
            
            for (int j = 0; j < 10; j++) {
                
                if(order.getOrder().equals("Random")){
                    
                    for (int k = 0; k < 10; k++) {
                        somatorioRandom += GenerateContent.runTime(method, order, i, k);
                    }
                    somatorio += somatorioRandom/10;
                    System.out.println("somatorioRandom com " + i + " = " + somatorioRandom/10);
                    somatorioRandom = 0;
                    
                }
                else{
                            
                    somatorio += GenerateContent.runTime(method, order, i);
                    
                }
            }
            
            content += somatorio/10   + "\r\n";
            System.out.println("Media com " + i + " = " + somatorio/10);
            somatorio = 0;
           
        }
        
        for (int i = 1000; i < 10000; i+=1000) {
            
            for (int j = 0; j < 10; j++) {
                
                if(order.getOrder().equals("Random")){
                    
                    for (int k = 0; k < 10; k++) {
                        somatorioRandom += GenerateContent.runTime(method, order, i, k);
                    }
                    somatorio += somatorioRandom/10;
                    System.out.println("somatorioRandom com " + i + " = " + somatorioRandom/10);
                    somatorioRandom = 0;
                }
                else{
                            
                    somatorio += GenerateContent.runTime(method, order, i);
                    
                }
            }
            
            content += somatorio/10   + "\r\n";
            System.out.println("Media com " + i + " = " + somatorio/10);
            somatorio = 0;
           
        }
        
        for (int i = 10000; i <= 100000; i+=10000) {
            
            for (int j = 0; j < 10; j++) {
                
                if(order.getOrder().equals("Random")){
                    
                    for (int k = 0; k < 10; k++) {
                        somatorioRandom += GenerateContent.runTime(method, order, i, k);
                    }
                    somatorio += somatorioRandom/10;
                    System.out.println("somatorioRandom com " + i + " = " + somatorioRandom/10);
                    somatorioRandom = 0;
                }
                else{
                            
                    somatorio += GenerateContent.runTime(method, order, i);
                    
                }
            }
            
            content += somatorio/10   + "\r\n";
            System.out.println("Media com " + i + " = " + somatorio/10);
            somatorio = 0;
           
        }
        
        nameFile = method.getAlgorithm() + "-" + order;
        
        try {
            ManipulationDirectories.createReport(nameFile, content);
        } catch (IOException ex) {
            Logger.getLogger(GenerateFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
//Gets and Sets

    
    
    
}
