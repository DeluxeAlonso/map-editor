/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author alulab11
 */
public class Cell implements Serializable{
    //private int posX;
    //private int posY;
    /**
     * Access indicates if the cell is allowed to insert an object
     * Wi represents the Widht of the cell
     * He represents the Height of the cell
     * Terr is a Field object
     * Content indicates what object has on it
     */
    private boolean access;
    private Field terr;
    private Object obj;
    private char content;
    private Point initObjectPosition;

    public Point getInitObjectPosition() {
        return initObjectPosition;
    }

    public void setInitObjectPosition(int  x, int y) {
        this.initObjectPosition = new Point(x,y);
    }
        
    
    public Cell(){
        this.setInitObjectPosition(0,0);
        this.access=true;
        this.terr = new Field();
        this.content = '-';
        
    }
    
    public boolean hasInitObject(){
        if( this.initObjectPosition.equals(new Point(0,0)) ){
            return false;
        } else {
            return true;
        }
    }
    public void setObject(Object o){
        this.obj = o;
    }
    
    public Object getObject(){
        return obj;
    }

    /**
     * @return the access
     */
    public boolean isAccess() {
        return access;
    }

    /**
     * @param access the access to set
     */
    public void setAccess(boolean access) {
        this.access = access;
    }
    
    public Field getTerr() {
        return terr;
    }

    public void setTerr(Field terr) {
        this.terr = terr;
    }

    public char getContent() {
        return content;
    }

    public void setContent(char content) {
        this.content = content;
    }

    

}