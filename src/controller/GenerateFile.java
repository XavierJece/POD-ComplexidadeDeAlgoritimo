/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
    public static void createFileAscending(enumSortType shortType){
        String dir = shortType.getAlgorithm();
        
        if(ManipulationDirectories.createDirectory(dir)){
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

                nameFile = "Ascending-" + shortType.getAlgorithm() + "_" + i;
                content = GenerateContent.contentAscending(i);
                
                try {
                    ManipulationDirectories.createFile(dir, nameFile, content);
                } catch (IOException ex) {
                    Logger.getLogger(GenerateFile.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
    
    public static void createFileDecreasing(enumSortType shortType){
        String dir = shortType.getAlgorithm();
        
        if(ManipulationDirectories.createDirectory(dir)){
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

                nameFile = "Decreasing-" + shortType.getAlgorithm() + "_" + i;
                content = GenerateContent.contentDecreasing(i);
                
                try {
                    ManipulationDirectories.createFile(dir, nameFile, content);
                } catch (IOException ex) {
                    Logger.getLogger(GenerateFile.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }
    
    public static void createFileRandom(enumSortType shortType){
        String dir = shortType.getAlgorithm();
        
        if(ManipulationDirectories.createDirectory(dir)){
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

                nameFile = "Random-" + shortType.getAlgorithm() + "_" + i + "-" + j;
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
    
    //Gets and Sets
}
