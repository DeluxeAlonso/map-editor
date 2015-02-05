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
public class Archer  extends Character implements Serializable {
    /**
     * Damage is the amount of damage of the Character
     * Represent is the char that indicates the character on the map
     * 
     */
     
    private int damage;
    private char represent;
    
    public Archer(){
        this.setTypAtq('M');
        this.setLifeP(300);
        this.setTypArmor(50);
        this.damage = 60;
        this.represent = 'h';
        this.setNombreObj("Archer");
        this.setWidthOcc(1);
        this.setHeightOcc(1);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public char getRepresent() {
        return represent;
    }

    public void setRepresent(char represent) {
        this.represent = represent;
    }
    
}
