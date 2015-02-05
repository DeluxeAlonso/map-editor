/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author alulab11
 */
public abstract class Object  implements Serializable{
    /**
     * IdObject is a number that is an identification of the object
     * widhtOcc is the number of cells occupied for the widht of the map
     * heightOcc is the number of cells occupied for the height of the map
     * nombreObj is the name of the object
     */
    private int IdObject;
    private int widthOcc;
    private int heightOcc;
    private String nombreObj;
    

    /**
     * @return the IdObject
     */
    
    public int getIdObject() {
        return IdObject;
    }

    /**
     * @param IdObject the IdObject to set
     */
    public void setIdObject(int IdObject) {
        this.IdObject = IdObject;
    }

    /**
     * @return the widthOcc
     */
    public int getWidthOcc() {
        return widthOcc;
    }

    /**
     * @param widthOcc the widthOcc to set
     */
    public void setWidthOcc(int widthOcc) {
        this.widthOcc = widthOcc;
    }

    /**
     * @return the heightOcc
     */
    public int getHeightOcc() {
        return heightOcc;
    }

    /**
     * @param heightOcc the heightOcc to set
     */
    public void setHeightOcc(int heightOcc) {
        this.heightOcc = heightOcc;
    }

    /**
     * @return the nombreObj
     */
    public String getNombreObj() {
        return nombreObj;
    }

    /**
     * @param nombreObj the nombreObj to set
     */
    public void setNombreObj(String nombreObj) {
        this.nombreObj = nombreObj;
    }
    
    /**
     * This method allows us to show the information of a villager
     *  
     */
    public static void showVillager(Cell c){
        Villager v = (Villager)c.getObject();//Aqui
        JOptionPane.showMessageDialog(null,"Name = "+v.getNombreObj()+"\nDamage  = "+v.getDamage()+"\nType Attack = "+v.getTypAtq()+"\nArmor = "+v.getTypArmor() +
                                        "\nLife Points = "+v.getLifeP()+"\nTeam = "+v.getTeam()+"\nId = "+v.getIdObject()+"\nField: "+c.getTerr().getNameField(),"Villager Info", 1);
    }
    
    /**
     * 
     * This method allows us to show the information of a house
     */
    
    public static void showHouse(Cell c){
        House h = (House)c.getObject();
        
        JOptionPane.showMessageDialog(null, "Armor = "+h.getArmor()+"\nName = "+h.getNombreObj()+"\nCapacity = "+h.getCapacity()+"\nLife Points = "+h.getLifeP()+
                                            "\nTeam = "+h.getTeam()+"\nID = "+h.getIdObject()+"\nField: "+c.getTerr().getNameField(), "House Info", 1);
    }
    
    public static void showDoctor(Cell c){
        Doctor d = (Doctor)c.getObject();
        JOptionPane.showMessageDialog(null,"Name = "+d.getNombreObj()+"\nType Attack = "+d.getTypAtq()+"\nArmor = "+d.getTypArmor() +
                                        "\nLife Points = "+d.getLifeP()+"\nTeam = "+d.getTeam()+"\nId = "+d.getIdObject()+"\nField: "+c.getTerr().getNameField(),"Villager Info", 1);
    }
    
    public static void showHorseRider(Cell c){
        Archer hr = (Archer)c.getObject();
        JOptionPane.showMessageDialog(null,"Name = "+hr.getNombreObj()+"Damage  = "+hr.getDamage()+"\nType Attack = "+hr.getTypAtq()+"\nArmor = "+hr.getTypArmor() +
                                        "\nLife Points = "+hr.getLifeP()+"\nTeam = "+hr.getTeam()+"\nId = "+hr.getIdObject()+"\nField: "+c.getTerr().getNameField(),"Villager Info", 1);
    }
    
    
    public static void showCastle(Cell c){
        Castle cl = (Castle)c.getObject();
        
        JOptionPane.showMessageDialog(null, "Armor = "+cl.getArmor()+"\nName = "+cl.getNombreObj()+"\nCapacity = "+cl.getCapacity()+"\nLife Points = "+cl.getLifeP()+
                                            "\nTeam = "+cl.getTeam()+"\nID = "+cl.getIdObject()+"\nField: "+c.getTerr().getNameField(), "House Info", 1);
    }
    public static void showArmory(Cell c){
        Armory a = (Armory)c.getObject();
        
        JOptionPane.showMessageDialog(null, "Armor = "+a.getArmor()+"\nName = "+a.getNombreObj()+"\nCapacity = "+a.getCapacity()+"\nLife Points = "+a.getLifeP()+
                                            "\nTeam = "+a.getTeam()+"\nID = "+a.getIdObject()+"\nField: "+c.getTerr().getNameField(), "House Info", 1);
    }
    
    
    /**
     * 
     * @param x is the coordenate X of the map
     * @param y is the coordenate Y of the map
     * @param m is the map
     * This method allows us to show the data of an object
     */
    public static void showInfo(int x, int y, Map m){
        String name;
        Cell c = m.getCeldas()[x-1][y-1];
        if(c.getObject() != null){
            name = c.getObject().getNombreObj();
            if(name.equalsIgnoreCase("Aldeano")){
                showVillager(c);
            }
            else if(name.equalsIgnoreCase("Casa"))
                showHouse(c);
            else if(name.equalsIgnoreCase("Doctor"))
                showDoctor(c);
            else if(name.equalsIgnoreCase("Jinete"))
                showHorseRider(c);
            else if (name.equalsIgnoreCase("Castillo"))
                showCastle(c);
            else if (name.equalsIgnoreCase("Armeria"))
                showArmory(c);
        }
        else
            JOptionPane.showMessageDialog(null, "La celda no contiene ningun objeto", "Mensaje de error", 0);
    }
}
