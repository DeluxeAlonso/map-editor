/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

/**
 *
 * @author alulab11
 */
public class Field extends Object implements Serializable{
    /**
     * nameField is the name of the field in the map
     * typeField is a char thah indicates the field in the map
     */
    private String nameField;
    private char typeField;
    
    public Field(){
        this.nameField = "Grass";
        this.typeField = '-';
    }
    
    public Field(String n){
        this.nameField = n;
    }
    
    public String getNameField() {
        return nameField;
    }

    public char getTypeField() {
        return typeField;
    }

   
}
