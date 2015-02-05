/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mapeditor;

import controller.Manager;
import model.Map;
import view.MainWindow;



/**
 *
 * @author CARLOS
 */
@SuppressWarnings("static-access")
public class MapEditor{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        Manager mMan = new Manager();
        
        
           
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
        // TODO code application logic here

    }
}
