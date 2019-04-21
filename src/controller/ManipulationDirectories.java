/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jece Xavier
 */
public abstract class ManipulationDirectories{

    //Attributes
    //Constructor
    //My Functions
    
    public static boolean createDirectory(String name){
        File newDir = new File("src\\model\\" + name);

        // if the directory does not exist, create it
        if (!newDir.exists()) {
            //System.out.println("creating directory: " + newDir.getName());
            boolean result = false;

            try{
                newDir.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                //handle it
            }        
            return result;
        }else{
            return true;
        }
    }
 
    public static void createFile(String path, String name, String content) throws IOException {
        File dir  = new File("src\\model\\" + path);
        File f = new File("src\\model\\" + path, name + ".txt");
        
        
        if(dir.exists()){
            
            if(!f.exists()){
                System.out.printf("Criando arquivo: \n  " + f.getName() + "\n");
                FileWriter fw = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fw);
                pw.write(content);
                pw.flush();
                pw.close();
                fw.close();
            }
        }
    }
    
    public static File[] listFiles(String path) {
        return null;
    }

    
    public static int[] readFile(String path, String name) {
        return null;
    }
    
    //Gents and Sets
}
