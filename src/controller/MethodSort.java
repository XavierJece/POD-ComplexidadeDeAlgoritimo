/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.GenerateFile;
import model.enumSortType;
import java.io.File;
import java.io.IOException;
import model.enumOrdertype;

/**
 *
 * @author Jece Xavier
 */
public class MethodSort {
    
    //Attributes
    
    
    //Constructor
    public MethodSort(enumSortType s) throws IOException {
            GenerateFile.createFileReport(s, enumOrdertype.ASCENDING);
            GenerateFile.createFileReport(s, enumOrdertype.DECREASING);
            GenerateFile.createFileReport(s, enumOrdertype.RANDOM);
    }
    //My Functions
    //Gents and Sets
}
