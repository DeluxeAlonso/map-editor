package view;
import controller.Manager;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import model.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alulab11
 */
public class PaletPanel extends javax.swing.JPanel {
private String [][] paleta=new String[3][4];
private ImageRepository repo = new ImageRepository();
    /**
     * Creates new form PaletPanel
     */
    public PaletPanel() {
        initComponents();
        paleta[0][0]="VillagerP";
        paleta[1][0]="HouseP";
        paleta[0][1]="ArqueroP";
        paleta[1][1]="DoctorP";
        paleta[0][2]="CastleP";
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
@Override
    public void paintComponent(Graphics g)
    {
        
        
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j <3; j++) {
                    
                    BufferedImage bf = repo.getImage(paleta[i][j]);
                    
                    if(bf!=null)
                        g.drawImage(bf, i*62, j*62, null);
                }
            }
        

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
