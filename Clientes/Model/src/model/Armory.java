/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

/**
 *
 * @author CARLOS
 */
public class Armory extends Building implements Serializable{
    /**
     * Represent is the char that indicates the character on the map
     */
    private char represent;
    
    public Armory(){
        this.setArmor(40);
        this.setLifeP(1000);
        this.setCapacity(100);
        this.represent = 'A';
    }

    public char getRepresent() {
        return represent;
    }

    public void setRepresent(char represent) {
        this.represent = represent;
    }
    
}
