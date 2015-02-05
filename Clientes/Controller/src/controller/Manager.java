/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import demoserverrmi.IServices;
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
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import model.Character;
import java.io.File;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;




/**
 *
 * @author alulab11
 */
public class Manager {
    
     
    private static Map  m ;
    private static String host = "192.168.207.211";
    
    
    

    /**
     * 
     * @param v1 is the villager to add to the map
     * @param x is a coordenate for the map
     * @param y is a coordenate for the map
     * @param m is the map 
     * This method allows us to add a new villager
     
     */
    public static void addVillager(Villager v1, int x, int y){
         try {
            Registry reg = LocateRegistry.getRegistry(host, 1099);
            IServices proxy = (IServices)reg.lookup("MyServer");
          
            proxy.addVillager(v1, x, y);

        } catch (Exception ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
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
       try {
            Registry reg = LocateRegistry.getRegistry(host, 1099);
            IServices proxy = (IServices)reg.lookup("MyServer");
          
            proxy.addHouse(h1, x, y);

        } catch (Exception ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
       try {
            Registry reg = LocateRegistry.getRegistry(host, 1099);
            IServices proxy = (IServices)reg.lookup("MyServer");
          
            proxy.addArcher(a1, x, y);

        } catch (Exception ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
        try {
            Registry reg = LocateRegistry.getRegistry(host, 1099);
            IServices proxy = (IServices)reg.lookup("MyServer");
          
            proxy.addArmory(a1, x, y);

        } catch (Exception ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public static void addCastle(Castle c1, int x, int y){
         try {
            Registry reg = LocateRegistry.getRegistry(host, 1099);
            IServices proxy = (IServices)reg.lookup("MyServer");
          
            proxy.addCastle(c1, x, y);

        } catch (Exception ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } 
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
         try {
            Registry reg = LocateRegistry.getRegistry(host, 1099);
            IServices proxy = (IServices)reg.lookup("MyServer");
          
            proxy.addDoctor(d, x, y);

        } catch (Exception ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
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
         try {
            Registry reg = LocateRegistry.getRegistry(host, 1099);
            IServices proxy = (IServices)reg.lookup("MyServer");
          
            proxy.addField(f, x, y);

        } catch (Exception ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    /**
     * 
     * @param x is a coordenate 
     * @param y is a coordenate
     * @param o is the Object to add in XML File
     */
    
    public static void editXMLFile(int x, int y, Object o){
        try {
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File("C:\\Users\\alulab11\\salidaMapa.xml");
            Document doc = (Document)builder.build(xmlFile);
            Element nodoRaiz = doc.getRootElement();
            List pos = nodoRaiz.getChildren("Posicion");
            for(int i = 0;i<pos.size();i++){
                Element nodo = (Element)pos.get(i);
                String posX = nodo.getAttribute("X").getValue();
                String posY = nodo.getAttribute("Y").getValue();
                
                int a = Integer.parseInt(posX)+1;
                int b = Integer.parseInt(posY)+1;
                
                if((x == a) && (y == b) ){
                    Element obj = nodo.getChild("Objeto");
                    if(obj == null){
                        Element p = new Element("Objeto");
                        if(o.getHeightOcc() == 1){
                            Character ch = (Character)o;
                            p.addContent(new Element("Nombre").setText(ch.getNombreObj()));
                            p.addContent(new Element("ID").setText(""+ch.getIdObject()));
                            p.addContent(new Element("Equipo").setText(""+ch.getTeam()));
                            p.addContent(new Element("Armadura").setText(""+ch.getTypArmor()));
                            p.addContent(new Element("LifePoints").setText(""+ch.getLifeP()));
                            p.addContent(new Element("TipoAtaque").setText(""+ch.getTypAtq()));
                            nodo.addContent(p);
                        }
                        else if(o.getHeightOcc() > 1){
                            Building bl = (Building)o;
                            p.addContent(new Element("Nombre").setText(bl.getNombreObj()));
                            p.addContent(new Element("ID").setText(""+bl.getIdObject()));
                            p.addContent(new Element("Equipo").setText(""+bl.getTeam()));
                            p.addContent(new Element("Armadura").setText(""+bl.getArmor()));
                            p.addContent(new Element("LifePoints").setText(""+bl.getLifeP()));
                            p.addContent(new Element("Capacidad").setText(""+bl.getCapacity()));
                            nodo.addContent(p);
                        }
                    }
                }
            }
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("C:\\Users\\alulab11\\salidaMapa.xml"));
            
            System.out.println("File updated!");
        } catch (IOException | NumberFormatException | JDOMException e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * @param m is the map to save in the XML file
     * THIS METHOD SAVES THE DATA OF THE MAP AS A PARAMETER IN AN XML FILE
     */
    
    public static void saveXMLFile(){
        
        Map prueba = getM();
        
        if (prueba == null)
        {
            JOptionPane.showMessageDialog(null, "No se ha cargado ningun mapa");
            return;
        }
        try {
            Element mapa = new Element("Mapa");
            mapa.setAttribute(new Attribute("Width",""+prueba.getWi()));
            mapa.setAttribute(new Attribute("Height",""+prueba.getHe()));
            Document doc = new Document();
            doc.setRootElement(mapa);
            int i, j;
            for(i = 0;i< m.getWi();i++){
                for(j = 0;j< m.getHe();j++){
                    Element pos = new Element("Posicion");
                    pos.setAttribute(new Attribute("X", ""+i));
                    pos.setAttribute(new Attribute("Y", ""+j));
                    Cell c = m.getCeldas()[i][j];
                    pos.addContent(new Element("Campo").setText(c.getTerr().getNameField()));
                    if(c.getObject() != null){
                        Element obj = new Element("Objeto");
                        if(c.getObject().getHeightOcc() == 1){
                            Character ch = (Character)c.getObject();
                            obj.addContent(new Element("Nombre").setText(ch.getNombreObj()));
                            obj.addContent(new Element("ID").setText(""+ch.getIdObject()));
                            obj.addContent(new Element("Equipo").setText(""+ch.getTeam()));
                            obj.addContent(new Element("Armadura").setText(""+ch.getTypArmor()));
                            obj.addContent(new Element("LifePoints").setText(""+ch.getLifeP()));
                            obj.addContent(new Element("TipoAtaque").setText(""+ch.getTypAtq()));
                            pos.addContent(obj);
                        }
                        else{
                            Building b = (Building)c.getObject();
                            obj.addContent(new Element("Nombre").setText(b.getNombreObj()));
                            obj.addContent(new Element("ID").setText(""+b.getIdObject()));
                            obj.addContent(new Element("Equipo").setText(""+b.getTeam()));
                            obj.addContent(new Element("Armadura").setText(""+b.getArmor()));
                            obj.addContent(new Element("LifePoints").setText(""+b.getLifeP()));
                            obj.addContent(new Element("Capacidad").setText(""+b.getCapacity()));
                            pos.addContent(obj);
                        }
                    }
                    doc.getRootElement().addContent(pos);
                }
            }
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("../salidaMapa.xml"));
            System.out.println("File Saved!");
            //JOptionPane.showMessageDialog(null, "Mapa guardado correctamente");
        }
        catch (IOException io) {
                System.out.println(io.getMessage());
        }
    }
    
    /**
     * 
     * @param m 
     * @return 
     * THIS METHOD RETURNS A MAP CREATED OF THE XML FILE
     */
    
    public static void loadXMLFile(){
            
               
        try {
            File arch = new File("../salidaMapa.xml");
            Element nodoRaiz;
            SAXBuilder cons = new SAXBuilder();
            Document doc = cons.build(arch);
            
            
            
            nodoRaiz = doc.getRootElement();
            
            int height = Integer.parseInt(nodoRaiz.getAttribute("Height").getValue());
            int width = Integer.parseInt(nodoRaiz.getAttribute("Width").getValue());
            
            setM(new Map(width,height));
            List pos = nodoRaiz.getChildren("Posicion");
            
            
            for(int i = 0;i<pos.size();i++){
                Element nodo = (Element)pos.get(i);
                String posX = nodo.getAttribute("X").getValue();
                String posY = nodo.getAttribute("Y").getValue();
                
                int x = Integer.parseInt(posX);
                int y = Integer.parseInt(posY);
                
                String campo = nodo.getChild("Campo").getValue();
                if(!campo.equals("Plain")){
          
                    Field f = new Field(campo);
                    addField(f, x+1, y+1);
                } 
                List cact = nodo.getChildren("Objeto");
                if(!cact.isEmpty()){
                    Element obj = (Element)cact.get(0);
                    String name = obj.getChild("Nombre").getValue();
                    String cod = obj.getChild("ID").getValue();
                    String eq = obj.getChild("Equipo").getValue();
                    int c = Integer.parseInt(cod);
                    switch (name) {
                        case "Villager":
                            {
                                Villager v = new Villager();
                                v.setIdObject(c);
                                v.setHeightOcc(1);
                                v.setWidthOcc(1);
                                v.setTeam(eq.charAt(0));
                                addVillager(v, x+1, y+1);
                                break;
                            }
                        case "Archer":
                            {
                                Archer v = new Archer();
                                v.setIdObject(c);
                                v.setHeightOcc(1);
                                v.setWidthOcc(1);
                                v.setTeam(eq.charAt(0));
                                addArcher(v, x+1, y+1);
                                break;
                            }
                        case "Doctor":
                            {
                                Doctor v = new Doctor();
                                v.setIdObject(c);
                                v.setHeightOcc(1);
                                v.setWidthOcc(1);
                                v.setTeam(eq.charAt(0));
                                addDoctor(v, x+1, y+1);
                                break;
                            }
                        case "House":
                            {
                                House v = new House();
                                v.setIdObject(c);
                                v.setHeightOcc(2);
                                v.setWidthOcc(2);
                                v.setTeam(eq.charAt(0));
                                addHouse(v, x+1, y+1);
                                break;
                            }
                        case "Castle":
                            {
                                Castle v = new Castle();
                                v.setIdObject(c);
                                v.setHeightOcc(3);
                                v.setWidthOcc(3);
                                v.setTeam(eq.charAt(0));
                                addCastle(v, x+1, y+1);
                                break;
                            }
                        case "Armory":
                            {
                                Armory v = new Armory();
                                v.setIdObject(c);
                                v.setHeightOcc(2);
                                v.setWidthOcc(2);
                                v.setTeam(eq.charAt(0));
                                addArmory(v, x+1, y+1);
                                break;
                            }
                    }
                }
            }
            System.out.println("File Loaded!");
            
            
        } catch (IOException | NumberFormatException | JDOMException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public static void deleteXMLFile(int x, int y){
        try {
            SAXBuilder builder = new SAXBuilder();
            File xmlFile = new File("../salidaMapa.xml");
        
            Document doc = (Document) builder.build(xmlFile);
            Element rootNode = doc.getRootElement();
            
            List pos = rootNode.getChildren("Posicion");
            for(int i = 0;i<pos.size();i++){
                Element nodo = (Element)pos.get(i);
                String posX = nodo.getAttribute("X").getValue();
                String posY = nodo.getAttribute("Y").getValue();
                
                int a = Integer.parseInt(posX)+1;
                int b = Integer.parseInt(posY)+1;
                
                if(a == x && b == y){
                    Element obj = (Element)nodo.getChild("Objeto");
                    if(obj != null)
                        nodo.removeChild("Objeto");
                    break;
                }
            }
            XMLOutputter xmlOutput = new XMLOutputter();
 
		// display nice nice
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("../salidaMapa.xml"));
            
            
        } catch (IOException | NumberFormatException | JDOMException e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * 
     * @param x is the X coordenate for the map
     * @param y is the Y coordenate for the map
     * This method deletes an object from the map 
     */
    
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
