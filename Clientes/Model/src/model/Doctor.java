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
public class Doctor extends Character implements Serializable{
    /**
     * Represent is the char that indicates the character on the map
     */
    private char represent;
    
    public Doctor(){
        this.setTypAtq('E');
        this.setTypArmor(80);
        this.setLifeP(300);
        this.represent = 'D';
        this.setNombreObj("Doctor");
        this.setWidthOcc(1);
        this.setHeightOcc(1);
    }

    public char getRepresent() {
        return represent;
    }

    public void setRepresent(char represent) {
        this.represent = represent;
    }
    
}
