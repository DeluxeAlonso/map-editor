/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Armory;
import model.Building;
import model.Castle;
import model.Cell;
import model.Doctor;
import model.Field;
import model.Archer;
import model.House;
import model.Map;
import model.Villager;
import javax.swing.JOptionPane;
import model.Object;

import java.io.FileWriter;
import java.io.IOException;

import model.Character;
import java.io.File;
import java.util.List;



/**
 *
 * @author alulab11
 */
public class Manager {
    
     
    private static Map  m ;
    
    
    
    

    /**
     * 
     * @param v1 is the villager to add to the map
     * @param x is a coordenate for the map
     * @param y is a coordenate for the map
     * @param m is the map 
     * This method allows us to add a new villager
     
     */
    public static void addVillager(Villager v1, int x, int y){
        Cell c = getM().getCeldas()[x-1][y-1];
        if(c.isAccess()){
            c.setObject(v1);
            c.setAccess(false);
            c.setContent(v1.getRepresent());
            
            //JOptionPane.showMessageDialog(null,"El objeto se inserto correctamente");
        }
//        else
//            JOptionPane.showMessageDialog(null,"La celda no es accesible para el aldeano");
    }
    
    /**
     * 
     * @param h1 is the house to insert to the map
     * @param x is the X coordenate for the map
     * @param y is the Y coordenate for the map
     * @param m is the map 
     * 
     * THIS METHOD ALLOWS US TO ADD A NEW HOUSE
     */
    public static void addHouse(House h1, int x, int y){
        x--;y--;
        //Cell c = m.getCeldas()[x][y];
        int numX = h1.getHeightOcc();
        int numY = h1.getWidthOcc();
        boolean libre = verZone(x,y, getM(), numX, numY);
        if(libre){
            getM().getCeldas()[x][y].setObject(h1);
            for(int i = 0;i<numX;i++){
                for(int j = 0;j<numY;j++){
                    getM().getCeldas()[x+i][y+j].setAccess(false);
                    getM().getCeldas()[x+i][y+j].setContent(h1.getRepresent());
                    getM().getCeldas()[x+i][y+j].setInitObjectPosition(x,y);
                }
            }
        }
//        else
//            JOptionPane.showMessageDialog(null,"La celda no es accesible para la casa");
    }
    /**
     * 
     * @param hr1 is the horse rider to add to the map
     * @param x is a coordenate for the map
     * @param y is a coordenate for the map
     * @param m is the map 
     * 
     * ALLOWS US TO ADD A NEW HOURSE RIDER
     */
    public static void addArcher(Archer a1, int x, int y){
        Cell c = getM().getCeldas()[x-1][y-1];
        if(c.isAccess()){
            c.setObject(a1);
            c.setAccess(false);
            c.setContent(a1.getRepresent());
            
            //JOptionPane.showMessageDialog(null,"El objeto se inserto correctamente");
        }
//        else
//            JOptionPane.showMessageDialog(null,"La celda no es accesible para el jinete");
    }
    
    /**
     * 
     * @param x is a coordenate for the map
     * @param y is a coordenate for the map
     * @param m is the map 
     * @param numX is the number of cells occupied for the object to the widht of 
     * the map
     * @param numY is the number of cells occupied for the object to the height of
     * the map
     * @return false if that zone is not allowed to add an object 
     */
    private static boolean verZone(int x, int y, Map m, int numX, int numY){
        
        for(int i = 0;i<numX;i++){
            for(int j = 0;j<numY;j++){
                if(!m.getCeldas()[x+i][y+j].isAccess())
                    return false;
            }
        }
        return true;
    }
    /**
     * 
     * @param a1 is the armory to add to the map
     * @param x is the X coordenate for the map
     * @param y is the Y coordenate for the map
     * @param m is the map 
     * 
     * ADD AN NEW ARMORY
     */
    
    public static void addArmory(Armory a1, int x, int y){
        x--;y--;
        Cell c = getM().getCeldas()[x][y];
        int numX = a1.getHeightOcc();
        int numY = a1.getWidthOcc();
        boolean libre = verZone(x,y, getM(), numX, numY);
        if(libre){
            getM().getCeldas()[x][y].setObject(a1);
            for(int i = 0;i<numX;i++){
                for(int j = 0;j<numY;j++){
                    getM().getCeldas()[x+i][y+j].setAccess(false);
                    getM().getCeldas()[x+i][y+j].setContent(a1.getRepresent());
                    getM().getCeldas()[x+i][y+j].setInitObjectPosition(x, y);                    
                }
            }
        }
//        else
//            JOptionPane.showMessageDialog(null,"La celda no es accesible para la armeria");
        
    /* @param c1 is the castle to add to the map
     * @param x is the X coordenate for the map
     * @param y is the Y coordenate for the map
     * @param m is the map 
        
        ADD A NEW CASTLE
    */
    }
    public static void addCastle(Castle c1, int x, int y){
        x--;y--;
        Cell c = getM().getCeldas()[x][y];
        int numX = c1.getHeightOcc();
        int numY = c1.getWidthOcc();
        boolean libre = verZone(x,y, getM(), numX, numY);
        if(libre){
            getM().getCeldas()[x][y].setObject(c1);
            for(int i = 0;i<numX;i++){
                for(int j = 0;j<numY;j++){
                    getM().getCeldas()[x+i][y+j].setAccess(false);
                    getM().getCeldas()[x+i][y+j].setContent(c1.getRepresent());
                    getM().getCeldas()[x+i][y+j].setInitObjectPosition(x, y);
                }
            }
        }
//        else
//            JOptionPane.showMessageDialog(null,"La celda no es accesible para el castillo");
    }
    
    /**
     * 
     * @param d is the object Doctor to add to the map
     * @param x is the X coordenate for the map
     * @param y is the Y coordenate for the map
     * @param m is the map 
     * 
     * ADD A NEW DOCTOR
     */
    
    public static void addDoctor(Doctor d, int x, int y){
        Cell c = getM().getCeldas()[x-1][y-1];
        if(c.isAccess()){
            c.setObject(d);
            c.setAccess(false);
            c.setContent(d.getRepresent());
            
        }       
//        else
//            JOptionPane.showMessageDialog(null,"La celda no es accesible para el doctor");
        
    }
    /**
     * 
     * @param f is the fiel to add on the map
     * @param x is the X coordenate 
     * @param y is the Y coordenate
     * @param m is the map
     * ADD A FIELD ON THE MAP
     */
    
    public static void addField(Field f, int x, int y){
        Cell c = getM().getCeldas()[x-1][y-1];
        if(f.getNameField().equals("Cliff") || f.getNameField().equals("Tree") || f.getNameField().equals("Water")){
            c.setAccess(false);
        }
        c.setContent(f.getTypeField());
        c.setTerr(f);
        
    }
    
   
    public static void deleteObj(int x, int y){
        Cell c = getM().getCeldas()[x-1][y-1];
        if(c.getObject().getHeightOcc() == 1){
            c.setAccess(true);
            c.setContent('-');
            c.setObject(null);
        }
        else{
            x--;y--;
            int numX = c.getObject().getHeightOcc();
            int numY = c.getObject().getWidthOcc();
            for(int i = 0;i<numX;i++){
                for(int j = 0;j<numY;j++){
                    getM().getCeldas()[x+i][y+j].setObject(null);
                    getM().getCeldas()[x+i][y+j].setAccess(true);
                    getM().getCeldas()[x+i][y+j].setContent('-');
                }
            }
        }
    }

    /**
     * @return the m
     */
    public static Map getM() {
        return m;
    }

    /**
     * @param aM the m to set
     */
    public static void setM(Map aM) {
        m = aM;
    }
    
    
}
