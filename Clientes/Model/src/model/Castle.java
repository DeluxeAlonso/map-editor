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
public class Castle extends Building implements Serializable{
    /**
     * The variable REPRESENT indicates the respective character of the building 
     * in the map
     */
    private char represent;
    
    public Castle(){
        this.setNombreObj("Castle");
        this.setHeightOcc(2);
        this.setWidthOcc(2);
        this.setArmor(500);
        this.setCapacity(200);
        this.setLifeP(1200);
        this.represent = 'C';
    }

    public char getRepresent() {
        return represent;
    }

    public void setRepresent(char represent) {
        this.represent = represent;
    }
    
}
