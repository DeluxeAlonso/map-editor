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
public class Map implements Serializable{
    /**
     * wi is the widht of the map
     * he is the height of the map
     * celdas is a cell bidimensional array that contains the data of the
     * cells of the map
     */
    private int wi;
    private int he;
    private Cell [][] celdas;
    
    public Map(int x, int y){
        this.wi = x;
        this.he = y;
        this.celdas=new Cell[x][y];
        for(int i = 0;i<x;i++){
            for(int j=0;j<y;j++)
            {
                this.celdas[i][j]=new Cell();
            }
        }
            
    }
    
    public void setWi(int ancho){
        this.wi = ancho;
    }
    
    public void setHe(int altura){
        this.he = altura;
    }
    
    public int getWi(){
        return wi;
    }
    
    public int getHe(){
        return he;
    }

    /**
     * @return the celdas
     */
    public Cell[][] getCeldas() {
        return celdas;
    }

    /**
     * @param celdas the celdas to set
     */
    public void setCeldas(Cell[][] celdas) {
        this.celdas = celdas;
    }
    
    
    
}


