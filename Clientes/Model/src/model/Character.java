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
public class Character extends Object implements Serializable{
    /**
     * TypAtq is the type of attack of the character. It can be 'M'(Melee),
     * 'R'(Range) or 'N'(No Attack).
     * Armor is the amount of armor for the character.
     * lifeP is the life points of the character.
     * Team is a char that indicates the team of the character.
     */
    
    private char typAtq;
    private int Armor;
    private int lifeP;
    private char team;
    

    /**
     * @return the typAtq
     */
    
    
    
    public char getTypAtq() {
        return typAtq;
    }

    /**
     * @param typAtq the typAtq to set
     */
    public void setTypAtq(char typAtq) {
        this.typAtq = typAtq;
    }

    /**
     * @return the typArmor
     */
    public int getTypArmor() {
        return Armor;
    }

    /**
     * @param Armor
     */
    public void setTypArmor(int Armor) {
        this.Armor = Armor;
    }

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
     * @return the team
     */
    public char getTeam() {
        return team;
    }

    /**
     * @param team the team to set
     */
    public void setTeam(char team) {
        this.team = team;
    }
    
}
