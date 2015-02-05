/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demoserverrmiimpl;

import controller.Manager;
import demoserverrmi.IServices;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.Archer;
import model.Armory;
import model.Castle;
import model.Doctor;
import model.Field;
import model.House;
import model.Map;
import model.Villager;

/**
 *
 * @author alulab11
 */
public class ServicesImpl extends UnicastRemoteObject  implements IServices {
    Manager mMan= new Manager();
    public ServicesImpl() throws RemoteException{             
       
    }
    
    @Override
    public String greetings(String name) throws RemoteException {
        System.out.println("El valor enviado es " + name);        
        return "Hola " + name +", como esta la familia?";
    }

    @Override
    public Map getMapa() throws RemoteException {       
        return mMan.getM();
    }

    @Override
    public void addVillager(Villager v1, int x, int y) throws RemoteException {
        mMan.addVillager(v1, x, y);
    }

    @Override
    public void addHouse(House h1, int x, int y) throws RemoteException{
        mMan.addHouse(h1, x, y);
    }

    @Override
    public void addArcher(Archer a1, int x, int y) throws RemoteException{
        mMan.addArcher(a1,x,y);
    }

    @Override
    public void addArmory(Armory a1, int x, int y) throws RemoteException{
        mMan.addArmory(a1, x, y);
    }

    @Override
    public void addCastle(Castle c1, int x, int y) throws RemoteException{
        mMan.addCastle(c1, x, y);
    }

    @Override
    public void addDoctor(Doctor d, int x, int y) throws RemoteException{
        mMan.addDoctor(d, x, y);
    }

    @Override
    public void addField(Field f, int x, int y) throws RemoteException{
        mMan.addField(f, x, y);
    }
    
    
    
}
