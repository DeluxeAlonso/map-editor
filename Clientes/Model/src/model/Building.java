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
public class Building extends Object implements Serializable{
    /**
     * LifeP represents the life points of the object
     * Armor represents the amount of armor of the building
     * Capacity indicates the number of characters can go inside
     * Team indicates what is your team. Its represent with 1 or 2
    
    */
    private int lifeP;
    private int armor;
    private int capacity;
    private char team;

    /**
     * @return the lifeP
     */
    public int getLifeP() {
        return lifeP;
    }

    /**
     * @param lifeP the lifeP to set
     */
    public void setLifeP(int lifeP) {
        this.lifeP = lifeP;
    }

    /**
     * @return the armor
     */
    public int getArmor() {
        return armor;
    }

    /**
     * @param armor the armor to set
     */
    public void setArmor(int armor) {
        this.armor = armor;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public char getTeam() {
        return team;
    }

    public void setTeam(char team) {
        this.team = team;
    }
}
