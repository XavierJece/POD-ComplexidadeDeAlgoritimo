/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Jece Xavier
 */
public enum enumOrdertype {
    //Attributes
    ASCENDING("Ascending"),
    DECREASING("Decreasing"),
    RANDOM("Random");
    
    //Constructor
    private String order;
    
    enumOrdertype(String order){
        this.order = order;
    }
    
    //My Functions
    
    //Gets and Sets

    public String getOrder() {
        return this.order;
    }
}
