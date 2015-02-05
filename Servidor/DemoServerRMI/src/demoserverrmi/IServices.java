/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demoserverrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Map;
import model.*;

/**
 *
 * @author alulab11
 */
public interface IServices extends Remote {
    String greetings(String name) throws RemoteException;
    
    Map getMapa()throws RemoteException;; 
    
    void addVillager(Villager v1, int x, int y)throws RemoteException;

    void addHouse(House h1, int x, int y)throws RemoteException;
    
    void addArcher(Archer a1, int x, int y)throws RemoteException;
    
    void addArmory(Armory a1, int x, int y)throws RemoteException;
    
    void addCastle(Castle c1, int x, int y)throws RemoteException;
    
    void addDoctor(Doctor d, int x, int y)throws RemoteException;
    
    void addField(Field f, int x, int y)throws RemoteException;
}
