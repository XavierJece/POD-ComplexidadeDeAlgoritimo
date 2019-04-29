/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jece Xavier
 */
public abstract class ManipulationDirectories{

    //Attributes
    //Constructor
    //My Functions
    
    public static boolean createDirectory(){
        File newDir = new File("src\\database\\");

        // if the directory does not exist, create it
        if (!newDir.exists()) {
            //System.out.println("creating directory: " + newDir.getName());
            boolean result = false;

            try{
                newDir.mkdir();
                result = true;
            } 
            catch(SecurityException ex){
                //handle it
            }        
            return result;
        }else{
            return true;
        }
    }
 
    public static void createFile(String path, String name, String content) throws IOException {
        File dir  = new File(path);
        File f = new File(path, name + ".txt");
        
        
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
    
    public static int[] readFile(String name,int tamanho) throws IOException {
        
        FileReader f = new FileReader("src\\database\\" + name + ".txt");
        BufferedReader read = new BufferedReader(f);
        int numbers[] = new int[tamanho];
        int i = 0;
        
        
        String line = read.readLine(); // lê a primeira linha
        // a variável "linha" recebe o valor "null" quando o processo
        // de repetição atingir o final do arquivo texto
        while (line != null) {
            //System.out.printf("%s\n", linha);
            numbers[i] = Integer.parseInt(line);
            i++;
            
            line = read.readLine(); // lê da segunda até a última linha
        }


        
        return numbers;
    }
    
    public static void createReport(String name, String content) throws IOException{
        String path = "src\\database\\report";
        File dir  = new File(path);
        File f = new File(path, name + ".txt");
        
        
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
    
    public static ArrayList readReport(String name) throws IOException {
        
        FileReader f = new FileReader("src\\database\\report\\" + name + ".txt");
        BufferedReader read = new BufferedReader(f);
        
        ArrayList numbers = new ArrayList();
        
        String line = read.readLine(); // lê a primeira linha
        // a variável "linha" recebe o valor "null" quando o processo
        // de repetição atingir o final do arquivo texto
        while (line != null) {
            //System.out.printf("%s\n", linha);
            numbers.add(((Integer.parseInt(line))/ 1000));
            
            line = read.readLine(); // lê da segunda até a última linha
        }


        
        return numbers;
    }
    
    //Gents and Sets
}
