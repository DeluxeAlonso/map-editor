/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demoserverrmiimpl;

import controller.Manager;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Map;

/**
 *
 * @author alulab11
 */
public class DemoServerRMIImpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager mMan =  new Manager();                
        mMan.setM(new Map(20,20)); 
        
        try {
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("MyServer", new ServicesImpl());
            System.out.println("Servidor iniciado!");            
        } catch (RemoteException ex) {
            Logger.getLogger(DemoServerRMIImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
