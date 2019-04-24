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

/**
 *
 * @author Jece Xavier
 */
public class MethodSort {
    
    //Attributes
    
    
    //Constructor
    public MethodSort(enumSortType s) {
            GenerateFile.createFileAscending();
            GenerateFile.createFileDecreasing();
            GenerateFile.createFileRandom();
    }
    //My Functions
    //Gents and Sets
}
