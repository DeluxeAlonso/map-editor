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
public class Villager extends Character implements Serializable{
    /**
     * Damage is the amount of damage of the Character
     * Represent is the char that indicates the character on the map
     * 
     */
    
    private int damage;
    private char represent;
    
    public Villager(){
        this.damage=45;
        this.represent='v';
        this.setTypAtq('M');
        this.setLifeP(200);
        this.setTypArmor(3);
        this.setNombreObj("Villager");
        this.setWidthOcc(1);
        this.setHeightOcc(1);
    }
    

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     * @return the represent
     */
    public char getRepresent() {
        return represent;
    }

    /**
     * @param represent the represent to set
     */
    public void setRepresent(char represent) {
        this.represent = represent;
    }
    
    
}
