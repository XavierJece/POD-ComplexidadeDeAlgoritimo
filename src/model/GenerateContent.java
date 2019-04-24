/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
    
    //Gets and Sets
}
